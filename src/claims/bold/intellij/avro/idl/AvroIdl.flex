package claims.bold.intellij.avro.idl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static claims.bold.intellij.avro.idl.psi.AvroIdlTypes.*;
import static claims.bold.intellij.avro.idl.AvroIdlParserDefinition.*;

%%

%class AvroIdlLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

WHITE_SPACE         = [ \t\f\r\n]

INT = "-"?(0|[1-9][:digit:]+)
FLOAT = {INT} ("."[:digit:]+)? ([eE][+-][:digit:]+)?
CHAR = [^\"\\]|\\.

%%

{WHITE_SPACE}+ { return TokenType.WHITE_SPACE; }

"{" { return LEFT_BRACE; }
"}" { return RIGHT_BRACE; }
"(" { return LEFT_PAREN; }
")" { return RIGHT_PAREN; }
"[" { return LEFT_BRACKET; }
"]" { return RIGHT_BRACKET; }
"<" { return LEFT_ANGLE; }
">" { return RIGHT_ANGLE; }
"@" { return AT; }
"," { return COMMA; }
";" { return SEMICOLON; }
"=" { return EQUALS; }

protocol { return PROTOCOL; }
enum { return ENUM; }
fixed { return FIXED; }
record { return RECORD; }
error { return ERROR; }

throws { return THROWS; }
oneway { return ONEWAY; }

namespace { return NAMESPACE; }
aliases { return ALIASES; }
order { return ORDER; }

int { return INT; }
long { return LONG; }
string { return STRING; }
boolean { return BOOLEAN; }
float { return FLOAT; }
double { return DOUBLE; }
null { return NULL; }
bytes { return BYTES; }
array { return ARRAY; }
map { return MAP; }
union { return UNION; }
true { return TRUE; }
false { return FALSE; }

`[^`]*` { return IDENTIFIER; }
[:jletter:][:jletterdigit:]* { return IDENTIFIER; }

"//"[^\r\n]* { return COMMENT_LINE; }
"/*"([^"*"]|("*"+[^"*""/"]))*("*"+"/")? { return COMMENT_BLOCK; }

\"{CHAR}*\" { return STRING_LITERAL; }
{INT} { return INT_LITERAL; }
{FLOAT} { return FLOAT_LITERAL; }

. { return TokenType.BAD_CHARACTER; }