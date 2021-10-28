grammar MYJSON;

prog : object;
object : '(' objectKeyValue (objectKeyValue)* ')';
objectKeyValue : STRING value;
array : '{' value (value)* '}';
value : NUMBER | STRING | COMPOUNDEDSTRING | NULL | BOOL | array | object;
NULL : 'null';
BOOL : 'true' | 'false';
STRING : ([a-zA-Z\u0410-\u044F_]){1, 1}[a-zA-Z\u0410-\u044F.\-_0-9]*;
COMPOUNDEDSTRING: '"' (STRING | [\n\t\r ])* '"';
NUMBER : [-]?[0-9]+ | [-]?[0-9]+[.]?[0-9]+;//первое для int, второе для double

//пропускаем:
WS : [\r\n\t ]+ -> skip;//переносы, табы, пробелы

COMMENTLINES : '/*' .*? '*/' -> skip;//многострочные комметарии
COMMENT : '//' ~('\r' | '\n')* -> skip;//однострочные коммантарии