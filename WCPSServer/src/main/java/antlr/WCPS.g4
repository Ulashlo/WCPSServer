grammar WCPS;

processCoveragesExpr:   coverageNamesDefinition
                        (reductCoverageNamesDefinition)?
                        (wherePart)?
                        returnPart EOF;

coverageNamesDefinition: FOR coverageNameDefinition ( ',' coverageNameDefinition)* ;

coverageNameDefinition: coverageName IN '(' coverageList ')' ;

reductCoverageNamesDefinition: LET reductCoverageNameDefinition ( ',' reductCoverageNameDefinition)* ;

reductCoverageNameDefinition: coverageName ':=' express;

coverageList:           NAME (',' NAME )* ;

coverageName:           VARNAME | NAME ;

wherePart:              WHERE express ;

returnPart:             RETURN express ;



express:                '(' rangeType ')' express                #castExp
                        | express '.' NAME                       #fieldExp
                        | NAME '(' funList ')'                   #funExp
                        | express
                        '[' ( dimensionIntervalList | coverageName ) ']'  #trimExp
                        | '-' express                            #unaryMinusExp
                        | '+' express                            #unaryPlusExp
                        | 'not' express                          #unaryNotExp
                        | express multOp express                 #multExp
                        | express addOp express                  #addExp
                        | express compOp express                 #compExp
                        | express 'and' express                  #andExp
                        | express 'or' express                   #orExp
                        | express 'xor' express                  #xorExp
                        | SWITCH
                        caseExp+
                        defaultExp?                              #switchExp
                        | condensePart
                        condenseOver
                        ( condenseWhere )?
                        condenseUsing                            #condenseExp
                        | lightConstructor                       #lightConstructorExp
                        | hardConstructor                        #hardConstructorExp
                        | constant                               #atomExp
		                | '(' express ')'                        #parenthesisExp ;

funList:                (funListElement | express) ( ',' (funListElement | express) )* ;

funListElement:         '{' (dimensionIntervalList | crsList | nameList) '}' ;

nameList:               coverageName ( ',' coverageName )* ;

crsList:                NAME ':' NAME  ( ',' NAME ':' NAME )* ;




lightConstructor:       ( 'struct' )? '{' constructorElement ( ';' constructorElement )* '}' ;

hardConstructor:        constructorCoverage
                        constructorOver
                        constructorValues ;

constructorCoverage:    COVERAGE coverageName ;

constructorOver:        OVER axisIteratorList ;

constructorValues:      (VALUES express | VALUE constructorValueElement) ;

constructorValueElement: LIST '<' constant ( ';' constant )* '>' ;

axisIteratorList:       axisIterator ( ',' axisIterator )* ;

axisIterator:           coverageName NAME dimensionIntervalExpr ;

constructorElement:     NAME ':' express ;




caseExp:                CASE express RETURN express ;

defaultExp:             DEFAULT RETURN express ;




condensePart:           CONDENSE condenseOpType ;

condenseOver:           OVER axisIteratorList ;

condenseWhere:          WHERE express ;

condenseUsing:          USING express ;




dimensionIntervalList:  (dimensionIntervalElement | dimensionPointElement) ( ',' (dimensionIntervalElement | dimensionPointElement) )* ;

dimensionPointElement:  NAME ( ':' NAME )? '(' express ')' ;

dimensionIntervalElement:  NAME ( ':' NAME )? dimensionIntervalExpr ;

dimensionIntervalExpr:  '(' express ':' express ')'
                        | '(' express ')' ;              //проверить нужно ли

constant:               coverageName
                        | stringConstant
                        | booleanConstant
                        | integerConstant
                        | floatConstant
                        | complexConstant ;

multOp:                 '*'
                        | '/' ;

addOp:                  '+'
                        | '-' ;

compOp:                 '='
                        | '!='
                        | '>'
                        | '>='
                        | '<'
                        | '<=' ;

condenseOpType:         '+'
                        | '*'
                        | 'max'
                        | 'min'
                        | 'and'
                        | 'or' ;

rangeType:              'bool'
                        | 'char'
                        | 'unsigned' 'char'
                        | 'short'
                        | 'unsigned' 'short'
                        | 'int'
                        | 'unsigned' 'int'
                        | 'long'
                        | 'unsigned' 'long'
                        | 'float'
                        | 'double'
                        | 'complex'
                        | 'complex2' ;

complexConstant:        '('  (floatConstant | integerConstant) ',' (floatConstant | integerConstant) ')'  ;

booleanConstant:        TRUE
                        | FALSE ;

integerConstant:        INTEGER
                        | INTEGER_8
                        | INTEGER_16 ;

floatConstant:          FLOAT ;

stringConstant:         STR ;



/* Key words*/
FOR                 : F O R ;
IN                  : I N ;
LET                 : L E T ;
WHERE               : W H E R E ;
RETURN              : R E T U R N ;
COVERAGE            : C O V E R A G E ;
OVER                : O V E R ;
VALUE               : V A L U E ;
LIST                : L I S T ;
VALUES              : V A L U E S ;
CONDENSE            : C O N D E N S E ;
USING               : U S I N G ;
SWITCH              : S W I T C H ;
CASE                : C A S E ;
DEFAULT             : D E F A U L T ;

TRUE                : T R U E ;
FALSE               : F A L S E ;

INTEGER             : '-'? INT ;
INTEGER_8           : '-'? '0' INT_8 ;
INTEGER_16          : '-'? ('0x' | '0X') INT_16 ;
FLOAT               : '-'? INT ('.' DIGIT*)? (E DIGIT*)? 'f'? ;
STR                 : '"' .*? '"' ;
NAME                : [a-zA-Z_][0-9a-zA-Z_]* ;
VARNAME             : '$'? NAME ;

WS                  : [ \t\r\n] -> skip ;
ANY                 : . ;

fragment LETTER     : [a-zA-Z] ;
fragment DIGIT      : [0-9] ;
fragment DIGIT_8    : [0-7] ;
fragment DIGIT_16   : [0-9a-fA-F] ;
fragment INT        : '0' | [1-9] DIGIT* ;
fragment INT_8      : '0' | [1-7] DIGIT_8* ;
fragment INT_16     : '0' | [1-9a-fA-F] DIGIT_16* ;

fragment A: [aA] ;
fragment B: [bB] ;
fragment C: [cC] ;
fragment D: [dD] ;
fragment E: [eE] ;
fragment F: [fF] ;
fragment G: [gG] ;
fragment H: [hH] ;
fragment I: [iI] ;
fragment J: [jJ] ;
fragment K: [kK] ;
fragment L: [lL] ;
fragment M: [mM] ;
fragment N: [nN] ;
fragment O: [oO] ;
fragment P: [pP] ;
fragment Q: [qQ] ;
fragment R: [rR] ;
fragment S: [sS] ;
fragment T: [tT] ;
fragment U: [uU] ;
fragment V: [vV] ;
fragment W: [wW] ;
fragment X: [xX] ;
fragment Y: [yY] ;
fragment Z: [zZ] ;