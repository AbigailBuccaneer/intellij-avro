// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static claims.bold.intellij.avro.idl.psi.AvroIdlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AvroIdlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ANNOTATION) {
      r = annotation(b, 0);
    }
    else if (t == ARRAY_TYPE) {
      r = array_type(b, 0);
    }
    else if (t == DECLARATION) {
      r = declaration(b, 0);
    }
    else if (t == DECLARATOR) {
      r = declarator(b, 0);
    }
    else if (t == ENUM_DECL) {
      r = enum_decl(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == FIXED_DECL) {
      r = fixed_decl(b, 0);
    }
    else if (t == IMPORT_DECL) {
      r = import_decl(b, 0);
    }
    else if (t == IMPORT_TYPE) {
      r = import_type(b, 0);
    }
    else if (t == MAP_TYPE) {
      r = map_type(b, 0);
    }
    else if (t == MESSAGE_DECL) {
      r = message_decl(b, 0);
    }
    else if (t == PRIMITIVE_TYPE) {
      r = primitive_type(b, 0);
    }
    else if (t == PROTOCOL_DEF) {
      r = protocol_def(b, 0);
    }
    else if (t == RECORD_DECL) {
      r = record_decl(b, 0);
    }
    else if (t == RECORD_TYPE) {
      r = record_type(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == UNION_TYPE) {
      r = union_type(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  /* ********************************************************** */
  // '@' annotation_name '(' annotation_body ')'
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, AT);
    p = r; // pin = 1
    r = r && report_error_(b, annotation_name(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_PAREN)) && r;
    r = p && report_error_(b, annotation_body(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_PAREN) && r;
    exit_section_(b, l, m, ANNOTATION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '[' [STRING_LITERAL (',' STRING_LITERAL)*] ']'
  static boolean annotation_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_array")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, LEFT_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, annotation_array_1(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACKET) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [STRING_LITERAL (',' STRING_LITERAL)*]
  private static boolean annotation_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_array_1")) return false;
    annotation_array_1_0(b, l + 1);
    return true;
  }

  // STRING_LITERAL (',' STRING_LITERAL)*
  private static boolean annotation_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    r = r && annotation_array_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' STRING_LITERAL)*
  private static boolean annotation_array_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_array_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation_array_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_array_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' STRING_LITERAL
  private static boolean annotation_array_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_array_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL | annotation_array
  static boolean annotation_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_body")) return false;
    if (!nextTokenIs(b, "", LEFT_BRACKET, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = annotation_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'namespace' | 'order' | 'aliases'
  static boolean annotation_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_name")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "namespace");
    if (!r) r = consumeToken(b, "order");
    if (!r) r = consumeToken(b, "aliases");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ declarator (',' declarator)* ]
  static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    arguments_0(b, l + 1);
    return true;
  }

  // declarator (',' declarator)*
  private static boolean arguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarator(b, l + 1);
    r = r && arguments_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' declarator)*
  private static boolean arguments_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!arguments_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arguments_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' declarator
  private static boolean arguments_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'array' '<' type '>'
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<array type>");
    r = consumeToken(b, "array");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LEFT_ANGLE));
    r = p && report_error_(b, type(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_ANGLE) && r;
    exit_section_(b, l, m, ARRAY_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // annotation? (import_decl | record_decl | enum_decl | fixed_decl | message_decl)
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration>");
    r = declaration_0(b, l + 1);
    r = r && declaration_1(b, l + 1);
    exit_section_(b, l, m, DECLARATION, r, false, null);
    return r;
  }

  // annotation?
  private static boolean declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // import_decl | record_decl | enum_decl | fixed_decl | message_decl
  private static boolean declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_decl(b, l + 1);
    if (!r) r = record_decl(b, l + 1);
    if (!r) r = enum_decl(b, l + 1);
    if (!r) r = fixed_decl(b, l + 1);
    if (!r) r = message_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type annotation? IDENTIFIER [ '=' expression ]
  public static boolean declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<declarator>");
    r = type(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, declarator_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && declarator_3(b, l + 1) && r;
    exit_section_(b, l, m, DECLARATOR, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_1")) return false;
    annotation(b, l + 1);
    return true;
  }

  // [ '=' expression ]
  private static boolean declarator_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_3")) return false;
    declarator_3_0(b, l + 1);
    return true;
  }

  // '=' expression
  private static boolean declarator_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ IDENTIFIER (',' IDENTIFIER)* ]
  static boolean enum_contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_contents")) return false;
    enum_contents_0(b, l + 1);
    return true;
  }

  // IDENTIFIER (',' IDENTIFIER)*
  private static boolean enum_contents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_contents_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && enum_contents_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' IDENTIFIER)*
  private static boolean enum_contents_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_contents_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!enum_contents_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_contents_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' IDENTIFIER
  private static boolean enum_contents_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_contents_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'enum' IDENTIFIER '{' enum_contents '}'
  public static boolean enum_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<enum decl>");
    r = consumeToken(b, "enum");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, enum_contents(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, ENUM_DECL, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // STRING_LITERAL | INT_LITERAL | FLOAT_LITERAL | 'true' | 'false' | 'null'
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, INT_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    if (!r) r = consumeToken(b, "null");
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // protocol_def*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    int c = current_position_(b);
    while (true) {
      if (!protocol_def(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'fixed' IDENTIFIER '(' expression ')' ';'
  public static boolean fixed_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<fixed decl>");
    r = consumeToken(b, "fixed");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, consumeToken(b, LEFT_PAREN)) && r;
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RIGHT_PAREN)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, FIXED_DECL, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'import' import_type STRING_LITERAL ';'
  public static boolean import_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<import decl>");
    r = consumeToken(b, "import");
    p = r; // pin = 1
    r = r && report_error_(b, import_type(b, l + 1));
    r = p && report_error_(b, consumeToken(b, STRING_LITERAL)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, IMPORT_DECL, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'idl' | 'protocol' | 'schema'
  public static boolean import_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import type>");
    r = consumeToken(b, "idl");
    if (!r) r = consumeToken(b, "protocol");
    if (!r) r = consumeToken(b, "schema");
    exit_section_(b, l, m, IMPORT_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'map' '<' type '>'
  public static boolean map_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<map type>");
    r = consumeToken(b, "map");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LEFT_ANGLE));
    r = p && report_error_(b, type(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_ANGLE) && r;
    exit_section_(b, l, m, MAP_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'throws' IDENTIFIER | 'oneway'
  static boolean message_attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_attributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = message_attributes_0(b, l + 1);
    if (!r) r = consumeToken(b, "oneway");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'throws' IDENTIFIER
  private static boolean message_attributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_attributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "throws");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type IDENTIFIER '(' arguments ')' message_attributes* ';'
  public static boolean message_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<message decl>");
    r = type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, LEFT_PAREN);
    p = r; // pin = 3
    r = r && report_error_(b, arguments(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PAREN)) && r;
    r = p && report_error_(b, message_decl_5(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, MESSAGE_DECL, r, p, null);
    return r || p;
  }

  // message_attributes*
  private static boolean message_decl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_decl_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!message_attributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "message_decl_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'int' | 'long' | 'string' | 'boolean' | 'float' | 'double' | 'null' | 'bytes' | IDENTIFIER
  public static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<primitive type>");
    r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "long");
    if (!r) r = consumeToken(b, "string");
    if (!r) r = consumeToken(b, "boolean");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "double");
    if (!r) r = consumeToken(b, "null");
    if (!r) r = consumeToken(b, "bytes");
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, PRIMITIVE_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // annotation? 'protocol' IDENTIFIER '{' declaration* '}'
  public static boolean protocol_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_def")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<protocol def>");
    r = protocol_def_0(b, l + 1);
    r = r && consumeToken(b, "protocol");
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, protocol_def_4(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, PROTOCOL_DEF, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean protocol_def_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_def_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // declaration*
  private static boolean protocol_def_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_def_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "protocol_def_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // record_type IDENTIFIER '{' (declarator ';')* '}'
  public static boolean record_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<record decl>");
    r = record_type(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, record_decl_3(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, RECORD_DECL, r, p, null);
    return r || p;
  }

  // (declarator ';')*
  private static boolean record_decl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_decl_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!record_decl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_decl_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // declarator ';'
  private static boolean record_decl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_decl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarator(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'record' | 'error'
  public static boolean record_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<record type>");
    r = consumeToken(b, "record");
    if (!r) r = consumeToken(b, "error");
    exit_section_(b, l, m, RECORD_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // annotation? ( array_type | map_type | union_type | primitive_type )
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = type_0(b, l + 1);
    r = r && type_1(b, l + 1);
    exit_section_(b, l, m, TYPE, r, false, null);
    return r;
  }

  // annotation?
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // array_type | map_type | union_type | primitive_type
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_type(b, l + 1);
    if (!r) r = map_type(b, l + 1);
    if (!r) r = union_type(b, l + 1);
    if (!r) r = primitive_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ type (',' type)* ]
  static boolean union_contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_contents")) return false;
    union_contents_0(b, l + 1);
    return true;
  }

  // type (',' type)*
  private static boolean union_contents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_contents_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && union_contents_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type)*
  private static boolean union_contents_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_contents_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!union_contents_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "union_contents_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' type
  private static boolean union_contents_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_contents_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'union' '{' union_contents '}'
  public static boolean union_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_type")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<union type>");
    r = consumeToken(b, "union");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LEFT_BRACE));
    r = p && report_error_(b, union_contents(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, UNION_TYPE, r, p, null);
    return r || p;
  }

}
