grammar MYJSON;

prog : '(' objectKeyValue (objectKeyValue)* ')';

objectKeyValue : '(' STRING value ')' | '(' objectKeyValue+ ')';
array : '{' ( value )+ '}';
value : STRING | NUMBER | objectKeyValue | array | NULL | BOOL;

NULL : 'null';
BOOL : 'true' | 'false';
STRING : [a-zA-Z_]+;
NUMBER : [-]?[0-9]+ | [-]?[0-9]+[.]?[0-9]+;//первое для int, второе для double

//пропускаем:
WS : [\r\n\t ]+ -> skip;//пробелы, табы, переносы
COMMENTLINES : '/*' .*? '*/' -> skip;//многострочные комметарии
COMMENT : '//' ~('\r' | '\n')* -> skip;//однострочные коммантарии