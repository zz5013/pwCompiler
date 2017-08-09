grammar pWhile;


// LITERALS

BOOL: 'true' | 'false';
INTEGER: SIGN?DIGIT+ ;


//PAIR_LIT: NULL;

// operators
MUL:        '*' ;
DIV:        '/' ;
MOD:        '%' ;
PLUS:       '+' ;
MINUS:      '-' ;
GT:         '>' ;
GTE:        '>=';
LT:         '<' ;
LTE:        '<=';
EQ:         '==';
NEQ:        '!=';
AND:        '&&';
OR:         '||';
NOT:        '!' ;
SEQ:        '=';


//stats
IF:         'if';
THEN:       'then';
ELSE:       'else';
FI:         'fi';
WHILE:      'while';
DO:         'do';
OD:         'od';
CHOOSE:     'choose';
ORR:        'or';
RO:         'ro';

//syntax
DECLARE:    ':';
RDASSIGN:   '?=';
ASSIGN:     ':=';
SEMICOLON:  ';';
COMMA:      ',';
HASH:       '#';
DDOT:       '..';
DOT:        '.';

//running
VAR:        'var';
BEGIN:      'begin';
END:        'end';
SKIPP:      'skip';
STOP:       'stop';
PARA:       'para';

//brackets
OPEN_PARENTHESES:     '(';
CLOSE_PARENTHESES:    ')';
OPEN_CURLY_BRACKET:   '{';
CLOSE_CURLY_BRACKET:  '}';
OPEN_SQUARE_BRACKET:  '[';
CLOSE_SQUARE_BRACKET: ']';

IDENT: (UNDERSCORE|LOWERALPHA|UPPERALPHA)(UNDERSCORE|LOWERALPHA|UPPERALPHA|DIGIT)*;

//alphabet
fragment UNDERSCORE: '_';
fragment LOWERALPHA: 'a'..'z';
fragment UPPERALPHA: 'A'..'Z';
fragment CHAR_FRAG: ~('\\'|'\''|'"') | '\\'ESCAPEDCHAR;

//numbers
fragment DIGIT : '0'..'9' ;
fragment SIGN: '+' | '-'  ;




//escaped characters
ESCAPEDCHAR: ('0'|'b'|'t'|'n'|'f'|'r'|'"'|'\'');

WHITESPACE: (' '|'\n'|'\t') -> channel(HIDDEN);

COMMENT: HASH(~'\n')* '\n' -> channel(HIDDEN);


//***************************************************************************************************


// AST (Abstract Syntax Tree)


binOpP1 : MUL
        | DIV
        | MOD
;

binOpP2 : PLUS
        | MINUS
;

binOpP3 : GT
        | GTE
        | LT
        | LTE
;

binOpP4 : EQ
        | NEQ
;

binOpP5 : AND;

binOpP6 : OR;

unaryOp : MINUS             #unaryOpInt
        | NOT               #unaryOpBool
;

stat  : SKIPP                                   #skip
      | STOP                                    #stop
      | IDENT DECLARE valueRange                #declareVariable
      | IDENT ASSIGN expr                       #assignment
      | IDENT RDASSIGN valueRange               #randomAssignment
      | IF expr THEN stat ELSE stat FI          #if
      | WHILE expr DO (OPEN_SQUARE_BRACKET INTEGER CLOSE_SQUARE_BRACKET)? (OPEN_SQUARE_BRACKET LT pr CLOSE_SQUARE_BRACKET)? stat OD  #while
      | CHOOSE pr DECLARE stat (ORR pr DECLARE stat)+ RO   #choose
      | IDENT binOpP2 SEQ pr                     #paraInc
      | stat SEMICOLON stat                     #statlist
;

expr  : INTEGER                                 #integer
      | BOOL                                    #bool
      | IDENT                                   #identifier
      | expr binOpP1 expr                       #binOp1Expr
      | expr binOpP2 expr                       #binOp2Expr
      | expr binOpP3 expr                       #binOp3Expr
      | expr binOpP4 expr                       #binOp4Expr
      | expr binOpP5 expr                       #binOp5Expr
      | expr binOpP6 expr                       #binOp6Expr
      | unaryOp expr                            #unaryOpExpr
      | OPEN_PARENTHESES expr CLOSE_PARENTHESES #nestedExpr
;

pr    : INTEGER DIV INTEGER  #fraction
      | MINUS? DOT INTEGER   #decimal
      | INTEGER              #oneOrZero
      | IDENT                #prVar
;

valueRange: OPEN_CURLY_BRACKET (expr(COMMA expr)*)? CLOSE_CURLY_BRACKET
          | OPEN_CURLY_BRACKET INTEGER DDOT INTEGER CLOSE_CURLY_BRACKET
;


para: PARA (IDENT DECLARE OPEN_SQUARE_BRACKET pr COMMA pr COMMA pr CLOSE_SQUARE_BRACKET)+ IDENT;

// main program
prog: (para)* VAR stat SEMICOLON BEGIN stat SEMICOLON END EOF;
// EOF indicates that the program must consume to the end of the input.

