package translator;

import antlr.WCPSLexer;
import antlr.WCPSParser;
import org.antlr.v4.runtime.*;
import org.codehaus.janino.ScriptEvaluator;
import java.util.LinkedList;

class CoverageIterator{
    private String iterName;
    private LinkedList<String> coverageNames;

    public CoverageIterator(String iterName) {
        this.iterName = iterName;
        coverageNames = new LinkedList<>();
    }

    public void addCoverage(String coverageName){
        this.coverageNames.add(coverageName);
    }

    public String getIterName() {
        return iterName;
    }

    public LinkedList<String> getCoverageNames() {
        return coverageNames;
    }
}

public class RequestExecutor {
    private LinkedList<CoverageIterator> coverages;
    private String script;
    private String dataLocation;
    private String key;

    public RequestExecutor(String request, String dataLocation, String key) {
        coverages = new LinkedList<>();
        CharStream inputStream = CharStreams.fromString(request);
        WCPSLexer lexer = new WCPSLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        WCPSParser parser = new WCPSParser(commonTokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalArgumentException ("Syntax error - line: " + line +  ", message: " + msg);
            }
        });
        try{
            WCPSParser.ProcessCoveragesExprContext fileContext = parser.processCoveragesExpr();
            WCPSWalker visitor = new WCPSWalker(this);
            this.script = visitor.visit(fileContext);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e.getMessage());
        } catch (Exception e){
            throw new IllegalArgumentException("Unknown error!");
        }
        this.dataLocation = dataLocation;
        this.key = key;
    }
    public void addCoverageIterator(String name, String[] covNames){
        CoverageIterator iter = new CoverageIterator(name);
        for(String n : covNames){
            iter.addCoverage(n);
        }
        coverages.add(iter);
    }

    public LinkedList<Object[]> execute() throws Exception {
        String[] names = getIterNames();
        int[] counts = new int[coverages.size()];
        int k = 0;
        boolean ret = true;
        LinkedList<Object[]> result = new LinkedList<>();
        int setNumber = 0;

        while (ret){
            Class[] classes = new Class[counts.length + 1];
            Object[] arguments = new Object[counts.length + 1];
            String[] covNames = new String[counts.length];
            for(int i = 0; i < counts.length; i++){
                String name = coverages.get(i).getCoverageNames().get(counts[i]);
                covNames[i] = name;
                arguments[i] = new Coverage(dataLocation + name);
                classes[i] = Coverage.class;
            }
            arguments[counts.length] = dataLocation;
            classes[counts.length] = String.class;
            names[counts.length] = "dataLocation";

            ScriptEvaluator se = new ScriptEvaluator();
            se.setDefaultImports(new String[]{"translator.*"});
            se.setParameters(names, classes);
            se.setReturnType(Object[].class);
            se.setThrownExceptions(new Class[]{Exception.class});
            String[] expressions = script.split("\t");
            String let = "";
            if(expressions.length == 3){
                let = expressions[2];
            }
            if(!expressions[0].equals("_")){
                se.cook("Translator calc = new Translator(dataLocation + \"" + key + setNumber + "\");\n" +
                        let +
                        "Object result = null;\n" +
                        "String extension;\n" +
                        "try{ \n" +
                        "if(" + expressions[0] + ") {result = " + expressions[1] + ";} else {\n" +
                        "return new Object[] {null, calc, null, null};}" +
                        "} catch(Exception ex){\n" +
                        "result = ex.getMessage();\n" +
                        "extension = \"txt\"\n;" +
                        "return new Object[] {result, calc, extension, null};" +
                        "}\n" +
                        "if(result.getClass().equals(Coverage.class)){\n" +
                        "extension = ((Coverage) result).getExtension();\n" +
                        "} else {\n" +
                        "extension = \"txt\"\n;" +
                        "}\n" +
                        "return new Object[] {result, calc, extension, null};");
            } else {
                se.cook("Translator calc = new Translator(dataLocation + \"" + key + setNumber + "\");\n" +
                        let +
                        "Object result = null;\n" +
                        "try{ \n" +
                        "result = " + expressions[1] + ";\n" +
                        "} catch(Exception ex){\n" +
                        "result = ex.getMessage();\n" +
                        "}\n" +
                        "String extension;\n" +
                        "if(result.getClass().equals(Coverage.class)){\n" +
                        "extension = ((Coverage) result).getExtension();\n" +
                        "} else {\n" +
                        "extension = \"txt\";\n" +
                        "}\n" +
                        "return new Object[] {result, calc, extension, null};");
            }
            Object[] res = (Object[]) se.evaluate(arguments);
            res[3] = covNames;
            if(res[0] != null){
                result.add(res);
            }
            setNumber++;
            while(counts[k] + 1 == coverages.get(k).getCoverageNames().size()){
                counts[k] = 0;
                k++;
                if(k == counts.length){
                    break;
                }
            }
            if(k == counts.length){
                ret = false;
            }else {
                counts[k]++;
                k = 0;
            }
        }
        return result;
    }

    private String[] getIterNames(){
        String[] names = new String[coverages.size() + 1];
        for (int i = 0; i < coverages.size(); i++){
            names[i] = coverages.get(i).getIterName();
        }
        return names;
    }
}
