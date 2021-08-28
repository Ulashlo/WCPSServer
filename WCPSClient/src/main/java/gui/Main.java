package gui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label hostLB = new Label("Server address:");
        hostLB.setMinSize(90, 20);
        hostLB.setPrefSize(90, 20);
        AnchorPane.setTopAnchor(hostLB,10.0);
        AnchorPane.setLeftAnchor(hostLB,10.0);

        TextField hostTF = new TextField("localhost");
        hostTF.setMinSize(100, 20);
        hostTF.setPrefSize(580, 20);
        AnchorPane.setTopAnchor(hostTF,10.0);
        AnchorPane.setLeftAnchor(hostTF,100.0);
        AnchorPane.setRightAnchor(hostTF,120.0);

        Label locLB = new Label("Directory:");
        locLB.setMinSize(90, 20);
        locLB.setPrefSize(90, 20);
        AnchorPane.setTopAnchor(locLB,40.0);
        AnchorPane.setLeftAnchor(locLB,10.0);

        TextField locTF = new TextField("C:\\Users\\Xiaomi\\Desktop\\Results");
        locTF.setMinSize(100, 20);
        locTF.setPrefSize(580, 20);
        AnchorPane.setTopAnchor(locTF,40.0);
        AnchorPane.setLeftAnchor(locTF,100.0);
        AnchorPane.setRightAnchor(locTF,120.0);

        Label cbLB = new Label("Example:");
        cbLB.setMinSize(90, 20);
        cbLB.setPrefSize(90, 20);
        AnchorPane.setTopAnchor(cbLB,73.0);
        AnchorPane.setLeftAnchor(cbLB,10.0);

        ObservableList<String> langs = FXCollections.observableArrayList(" - ", "Simple example", "Cast example", "Expression example",
                "A lot of results example", "Round functions example", "Functions example", "Aggregate function example",
                "Trim example", "Let example", "Where example", "Switch example");
        ComboBox<String> exsCB = new ComboBox<>(langs);
        exsCB.setValue(" - ");
        exsCB.setMinSize(100, 25);
        exsCB.setPrefSize(580, 25);
        AnchorPane.setTopAnchor(exsCB,70.0);
        AnchorPane.setLeftAnchor(exsCB,100.0);
        AnchorPane.setRightAnchor(exsCB,120.0);

        Button execB = new Button("Execute");
        execB.setMinSize(100, 85);
        execB.setPrefSize(100, 85);
        AnchorPane.setTopAnchor(execB,10.0);
        AnchorPane.setRightAnchor(execB,10.0);

        TextArea reqTA = new TextArea();
        reqTA.setMinSize(780, 120);
        reqTA.setPrefSize(780, 315);
        AnchorPane.setBottomAnchor(reqTA,140.0);
        AnchorPane.setTopAnchor(reqTA,105.0);
        AnchorPane.setLeftAnchor(reqTA,10.0);
        AnchorPane.setRightAnchor(reqTA,10.0);

        TextArea resTA = new TextArea();
        resTA.setMinSize(780, 120);
        resTA.setPrefSize(780, 120);
        AnchorPane.setBottomAnchor(resTA,10.0);
        AnchorPane.setLeftAnchor(resTA,10.0);
        AnchorPane.setRightAnchor(resTA,10.0);
        resTA.setEditable(false);

        exsCB.setOnAction(actionEvent -> {
            String text = getRequest(exsCB.getValue());
            if(text.length() > 0){
                reqTA.setText(text);
            }
        });

        execB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String host = hostTF.getText();
                if(host == null || host.length() == 0){
                    showMessage(Alert.AlertType.WARNING, "Warning", null, "Write server address!");
                    return;
                }
                String request = reqTA.getText();
                if(request == null || request.length() == 0){
                    showMessage(Alert.AlertType.WARNING, "Warning", null, "Write request!");
                    return;
                }
                Path path = Paths.get(locTF.getText());
                if (!Files.exists(path)) {
                    showMessage(Alert.AlertType.WARNING, "Warning", null, locTF.getText()+ " directory is not exist!");
                    return;                }
                String loc = locTF.getText();
                if(loc != null && loc.length() > 0){
                    if(!loc.endsWith("\\")){
                        loc += "\\";
                    }
                }else {
                    loc = "";
                }
                Controller controller = new Controller(host, request, loc);
                Response response = new Response();
                try {
                    response = controller.sendRequest(response);
                }catch (Exception ex){
                    showMessage(Alert.AlertType.ERROR, "Error", null, ex.getMessage());
                    return;
                }
                if(!response.isGot()){
                    showMessage(Alert.AlertType.ERROR, "Error", null, "Client can't to get response!");
                    return;
                }
                String result = "";
                LinkedList<String> answers = response.getAnswers();
                LinkedList<LinkedList<String>> coverages = response.getCoverages();
                LinkedList<Boolean> isImages = response.getIsImage();
                LinkedList<ImageWindow> images = new LinkedList<>();
                for(int i = 0; i < answers.size(); i++){
                    result += answers.get(i);
                    LinkedList<String> covs = coverages.get(i);
                    String c = covs.get(0);
                    for(int j = 1; j < covs.size(); j++){
                        c += ", " + covs.get(j);
                    }
                    if(isImages.get(i)){
                        images.add(new ImageWindow(loc + answers.get(i), answers.get(i)));
                    }
                    if(c.equals("no")){
                        result += "\n\n";
                    } else {
                        result += " - for " + c + ".\n\n";
                    }
                }
                resTA.setText(result);
                for (ImageWindow i : images) {
                    try {
                        Stage stage1 = new Stage();
                        stage1.initModality(Modality.NONE);
                        i.start(stage1);
                    } catch (Exception e) {
                        showMessage(Alert.AlertType.ERROR, "Error", null, "Impossible to show image!");
                    }
                }
            }
        });

        AnchorPane root = new AnchorPane(hostTF, locTF, execB, reqTA, resTA, hostLB , locLB, cbLB, exsCB);

        Scene scene = new Scene(root, 800, 560);

        stage.setScene(scene);
        stage.setMinHeight(330);
        stage.setMinWidth(320);
        stage.setTitle("WCPS");

        stage.show();
    }

    private String getRequest(String value) {
        switch (value){
            case "Simple example":
                return getRequestText("Simple_example.txt");
            case "A lot of results example":
                return getRequestText("A_lot_of_results_example.txt");
            case "Aggregate function example":
                return getRequestText("Aggregate_function_example.txt");
            case "Cast example":
                return getRequestText("Cast_example.txt");
            case "Expression example":
                return getRequestText("Expression_example.txt");
            case "Functions example":
                return getRequestText("Functions_example.txt");
            case "Let example":
                return getRequestText("Let_example.txt");
            case "Round functions example":
                return getRequestText("Round_functions_example.txt");
            case "Switch example":
                return getRequestText("Switch_example.txt");
            case "Trim example":
                return getRequestText("Trim_example.txt");
            case "Where example":
                return getRequestText("Where_example.txt");
            default:
                return "";
        }
    }

    public void showMessage(Alert.AlertType type, String title, String headerText, String contentText){
        Alert alert = new Alert(type);

        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);

        alert.showAndWait();
    }

    public String getRequestText(String filename){
        String text;
        try {
            text = new String(Files.readAllBytes(Paths.get("src\\main\\resources\\" + filename)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "";
        }
        return text;
    }
}
