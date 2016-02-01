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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
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
    else if (t == ENUM_VALUE) {
      r = enum_value(b, 0);
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
    else if (t == JSON_ARRAY) {
      r = json_array(b, 0);
    }
    else if (t == JSON_OBJECT) {
      r = json_object(b, 0);
    }
    else if (t == JSON_OBJECT_ENTRY) {
      r = json_object_entry(b, 0);
    }
    else if (t == JSON_VALUE) {
      r = json_value(b, 0);
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

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(DECLARATION, ENUM_DECL, FIXED_DECL, IMPORT_DECL,
      MESSAGE_DECL, RECORD_DECL),
    create_token_set_(ARRAY_TYPE, IMPORT_TYPE, MAP_TYPE, PRIMITIVE_TYPE,
      RECORD_TYPE, TYPE, UNION_TYPE),
  };

  /* ********************************************************** */
  // '<' type '>'
  static boolean angle_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "angle_type")) return false;
    if (!nextTokenIs(b, LEFT_ANGLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, LEFT_ANGLE);
    p = r; // pin = 1
    r = r && report_error_(b, type(b, l + 1));
    r = p && consumeToken(b, RIGHT_ANGLE) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '@' IDENTIFIER '(' annotation_body ')'
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, AT);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
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
  // annotation? 'array' angle_type
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, "<array type>", AT, ARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<array type>");
    r = array_type_0(b, l + 1);
    r = r && consumeToken(b, ARRAY);
    p = r; // pin = 2
    r = r && angle_type(b, l + 1);
    exit_section_(b, l, m, ARRAY_TYPE, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean array_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // import_decl | record_decl | enum_decl | fixed_decl | message_decl
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<declaration>");
    r = import_decl(b, l + 1);
    if (!r) r = record_decl(b, l + 1);
    if (!r) r = enum_decl(b, l + 1);
    if (!r) r = fixed_decl(b, l + 1);
    if (!r) r = message_decl(b, l + 1);
    exit_section_(b, l, m, DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type annotation? IDENTIFIER [ '=' json_value ]
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

  // [ '=' json_value ]
  private static boolean declarator_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_3")) return false;
    declarator_3_0(b, l + 1);
    return true;
  }

  // '=' json_value
  private static boolean declarator_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && json_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ enum_value (',' enum_value)* ]
  static boolean enum_contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_contents")) return false;
    enum_contents_0(b, l + 1);
    return true;
  }

  // enum_value (',' enum_value)*
  private static boolean enum_contents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_contents_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_value(b, l + 1);
    r = r && enum_contents_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' enum_value)*
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

  // ',' enum_value
  private static boolean enum_contents_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_contents_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enum_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation? 'enum' IDENTIFIER '{' enum_contents '}'
  public static boolean enum_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl")) return false;
    if (!nextTokenIs(b, "<enum decl>", AT, ENUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<enum decl>");
    r = enum_decl_0(b, l + 1);
    r = r && consumeToken(b, ENUM);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, enum_contents(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, ENUM_DECL, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean enum_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean enum_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_value")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUM_VALUE, r);
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
  // annotation? 'fixed' IDENTIFIER '(' INT_LITERAL ')' ';'
  public static boolean fixed_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_decl")) return false;
    if (!nextTokenIs(b, "<fixed decl>", AT, FIXED)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<fixed decl>");
    r = fixed_decl_0(b, l + 1);
    r = r && consumeToken(b, FIXED);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, consumeToken(b, LEFT_PAREN)) && r;
    r = p && report_error_(b, consumeToken(b, INT_LITERAL)) && r;
    r = p && report_error_(b, consumeToken(b, RIGHT_PAREN)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, FIXED_DECL, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean fixed_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_decl_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // annotation? 'import' import_type STRING_LITERAL ';'
  public static boolean import_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_decl")) return false;
    if (!nextTokenIs(b, "<import decl>", AT, IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<import decl>");
    r = import_decl_0(b, l + 1);
    r = r && consumeToken(b, IMPORT);
    p = r; // pin = 2
    r = r && report_error_(b, import_type(b, l + 1));
    r = p && report_error_(b, consumeToken(b, STRING_LITERAL)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, IMPORT_DECL, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean import_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_decl_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'idl' | 'protocol' | 'schema'
  public static boolean import_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import type>");
    r = consumeToken(b, IDL);
    if (!r) r = consumeToken(b, PROTOCOL);
    if (!r) r = consumeToken(b, SCHEMA);
    exit_section_(b, l, m, IMPORT_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' [ json_value (',' json_value)* ] ']'
  public static boolean json_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_array")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && json_array_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, JSON_ARRAY, r);
    return r;
  }

  // [ json_value (',' json_value)* ]
  private static boolean json_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_array_1")) return false;
    json_array_1_0(b, l + 1);
    return true;
  }

  // json_value (',' json_value)*
  private static boolean json_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = json_value(b, l + 1);
    r = r && json_array_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' json_value)*
  private static boolean json_array_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_array_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!json_array_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "json_array_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' json_value
  private static boolean json_array_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_array_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && json_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [ json_object_entry (',' json_object_entry)* ] '}'
  public static boolean json_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_object")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && json_object_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, JSON_OBJECT, r);
    return r;
  }

  // [ json_object_entry (',' json_object_entry)* ]
  private static boolean json_object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_object_1")) return false;
    json_object_1_0(b, l + 1);
    return true;
  }

  // json_object_entry (',' json_object_entry)*
  private static boolean json_object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_object_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = json_object_entry(b, l + 1);
    r = r && json_object_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' json_object_entry)*
  private static boolean json_object_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_object_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!json_object_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "json_object_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' json_object_entry
  private static boolean json_object_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_object_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && json_object_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL ':' json_value
  public static boolean json_object_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_object_entry")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    r = r && consumeToken(b, COLON);
    r = r && json_value(b, l + 1);
    exit_section_(b, m, JSON_OBJECT_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // json_object | json_array | STRING_LITERAL | INT_LITERAL | FLOAT_LITERAL | 'true' | 'false' | 'null'
  public static boolean json_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "json_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<json value>");
    r = json_object(b, l + 1);
    if (!r) r = json_array(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, INT_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, JSON_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // annotation? 'map' angle_type
  public static boolean map_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type")) return false;
    if (!nextTokenIs(b, "<map type>", AT, MAP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<map type>");
    r = map_type_0(b, l + 1);
    r = r && consumeToken(b, MAP);
    p = r; // pin = 2
    r = r && angle_type(b, l + 1);
    exit_section_(b, l, m, MAP_TYPE, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean map_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'throws' IDENTIFIER | 'oneway'
  static boolean message_attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_attributes")) return false;
    if (!nextTokenIs(b, "", ONEWAY, THROWS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = message_attributes_0(b, l + 1);
    if (!r) r = consumeToken(b, ONEWAY);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'throws' IDENTIFIER
  private static boolean message_attributes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_attributes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROWS);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation? type IDENTIFIER '(' arguments ')' message_attributes* ';'
  public static boolean message_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<message decl>");
    r = message_decl_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, LEFT_PAREN);
    p = r; // pin = 4
    r = r && report_error_(b, arguments(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PAREN)) && r;
    r = p && report_error_(b, message_decl_6(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, MESSAGE_DECL, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean message_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_decl_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // message_attributes*
  private static boolean message_decl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_decl_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!message_attributes(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "message_decl_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // annotation? ('int' | 'long' | 'string' | 'boolean' | 'float' | 'double' | 'null' | 'bytes' | IDENTIFIER)
  public static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<primitive type>");
    r = primitive_type_0(b, l + 1);
    r = r && primitive_type_1(b, l + 1);
    exit_section_(b, l, m, PRIMITIVE_TYPE, r, false, null);
    return r;
  }

  // annotation?
  private static boolean primitive_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // 'int' | 'long' | 'string' | 'boolean' | 'float' | 'double' | 'null' | 'bytes' | IDENTIFIER
  private static boolean primitive_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, BYTES);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation? 'protocol' IDENTIFIER '{' declaration* '}'
  public static boolean protocol_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_def")) return false;
    if (!nextTokenIs(b, "<protocol def>", AT, PROTOCOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<protocol def>");
    r = protocol_def_0(b, l + 1);
    r = r && consumeToken(b, PROTOCOL);
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
  // annotation? record_type IDENTIFIER '{' (declarator ';')* '}'
  public static boolean record_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<record decl>");
    r = record_decl_0(b, l + 1);
    r = r && record_type(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, record_decl_4(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, RECORD_DECL, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean record_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_decl_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // (declarator ';')*
  private static boolean record_decl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_decl_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!record_decl_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_decl_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // declarator ';'
  private static boolean record_decl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_decl_4_0")) return false;
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
    if (!nextTokenIs(b, "<record type>", ERROR, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<record type>");
    r = consumeToken(b, RECORD);
    if (!r) r = consumeToken(b, ERROR);
    exit_section_(b, l, m, RECORD_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_type | map_type | union_type | primitive_type
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<type>");
    r = array_type(b, l + 1);
    if (!r) r = map_type(b, l + 1);
    if (!r) r = union_type(b, l + 1);
    if (!r) r = primitive_type(b, l + 1);
    exit_section_(b, l, m, TYPE, r, false, null);
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
  // annotation? 'union' '{' union_contents '}'
  public static boolean union_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_type")) return false;
    if (!nextTokenIs(b, "<union type>", AT, UNION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<union type>");
    r = union_type_0(b, l + 1);
    r = r && consumeToken(b, UNION);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, LEFT_BRACE));
    r = p && report_error_(b, union_contents(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, UNION_TYPE, r, p, null);
    return r || p;
  }

  // annotation?
  private static boolean union_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_type_0")) return false;
    annotation(b, l + 1);
    return true;
  }

}
