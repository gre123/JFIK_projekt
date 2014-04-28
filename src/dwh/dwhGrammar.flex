package dwh;


%%

%class dwhSkaner
%type dwhToken


LineTerminator = \n|\r\n|\r
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator}|[\t|\f]
Comment = "//"  {InputCharacter}* {LineTerminator}

IntLiteral = 0 | [1-9][0-9]*


%%


[^]     {return dwhToken.blad;}