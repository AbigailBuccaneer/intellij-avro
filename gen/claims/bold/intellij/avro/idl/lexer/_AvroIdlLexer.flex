package claims.bold.intellij.avro.idl.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static claims.bold.intellij.avro.idl.psi.AvroIdlTypes.*;

%%

%{
  public _AvroIdlLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _AvroIdlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMMENT="//".*
DOC_COMMENT="/"\*\*([^*]|\*+[^/*])*\*+"/"
BLOCK_COMMENT="/"\*([^*]|\*+[^/*])*\*+"/"
IDENTIFIER=(`[^`]*`)|[:jletter:][[:jletterdigit:]\.-]*
STRING_LITERAL=\"([^\"]|\\\")*\"
INT_LITERAL=-?(0|[1-9][:digit:]*)
FLOAT_LITERAL={INT_LITERAL}(\.[:digit:]+)?([eE][+-]?[:digit:]+)?

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "{"                   { return LEFT_BRACE; }
  "}"                   { return RIGHT_BRACE; }
  "("                   { return LEFT_PAREN; }
  ")"                   { return RIGHT_PAREN; }
  "["                   { return LEFT_BRACKET; }
  "]"                   { return RIGHT_BRACKET; }
  "<"                   { return LEFT_ANGLE; }
  ">"                   { return RIGHT_ANGLE; }
  "@"                   { return AT; }
  ","                   { return COMMA; }
  ";"                   { return SEMICOLON; }
  ":"                   { return COLON; }
  "="                   { return EQUALS; }
  "protocol"            { return PROTOCOL; }
  "import"              { return IMPORT; }
  "idl"                 { return IDL; }
  "schema"              { return SCHEMA; }
  "record"              { return RECORD; }
  "error"               { return ERROR; }
  "enum"                { return ENUM; }
  "fixed"               { return FIXED; }
  "throws"              { return THROWS; }
  "oneway"              { return ONEWAY; }
  "int"                 { return INT; }
  "long"                { return LONG; }
  "string"              { return STRING; }
  "boolean"             { return BOOLEAN; }
  "float"               { return FLOAT; }
  "double"              { return DOUBLE; }
  "null"                { return NULL; }
  "bytes"               { return BYTES; }
  "array"               { return ARRAY; }
  "map"                 { return MAP; }
  "union"               { return UNION; }
  "true"                { return TRUE; }
  "false"               { return FALSE; }

  {LINE_COMMENT}        { return LINE_COMMENT; }
  {DOC_COMMENT}         { return DOC_COMMENT; }
  {BLOCK_COMMENT}       { return BLOCK_COMMENT; }
  {IDENTIFIER}          { return IDENTIFIER; }
  {STRING_LITERAL}      { return STRING_LITERAL; }
  {INT_LITERAL}         { return INT_LITERAL; }
  {FLOAT_LITERAL}       { return FLOAT_LITERAL; }

}

[^] { return BAD_CHARACTER; }
