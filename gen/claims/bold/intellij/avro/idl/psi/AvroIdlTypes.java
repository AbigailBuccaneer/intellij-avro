// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import claims.bold.intellij.avro.idl.psi.impl.*;

public interface AvroIdlTypes {

  IElementType ANNOTATION = new AvroIdlElementType("ANNOTATION");
  IElementType ARRAY_TYPE = new AvroIdlElementType("ARRAY_TYPE");
  IElementType DECLARATION = new AvroIdlElementType("DECLARATION");
  IElementType DECLARATOR = new AvroIdlElementType("DECLARATOR");
  IElementType ENUM_DECL = new AvroIdlElementType("ENUM_DECL");
  IElementType EXPRESSION = new AvroIdlElementType("EXPRESSION");
  IElementType FIXED_DECL = new AvroIdlElementType("FIXED_DECL");
  IElementType IMPORT_DECL = new AvroIdlElementType("IMPORT_DECL");
  IElementType IMPORT_TYPE = new AvroIdlElementType("IMPORT_TYPE");
  IElementType MAP_TYPE = new AvroIdlElementType("MAP_TYPE");
  IElementType MESSAGE_DECL = new AvroIdlElementType("MESSAGE_DECL");
  IElementType PRIMITIVE_TYPE = new AvroIdlElementType("PRIMITIVE_TYPE");
  IElementType PROTOCOL_DEF = new AvroIdlElementType("PROTOCOL_DEF");
  IElementType RECORD_DECL = new AvroIdlElementType("RECORD_DECL");
  IElementType RECORD_TYPE = new AvroIdlElementType("RECORD_TYPE");
  IElementType TYPE = new AvroIdlElementType("TYPE");
  IElementType UNION_TYPE = new AvroIdlElementType("UNION_TYPE");

  IElementType ARRAY = new AvroIdlTokenType("array");
  IElementType AT = new AvroIdlTokenType("@");
  IElementType BLOCK_COMMENT = new AvroIdlTokenType("BLOCK_COMMENT");
  IElementType BOOLEAN = new AvroIdlTokenType("boolean");
  IElementType BYTES = new AvroIdlTokenType("bytes");
  IElementType COMMA = new AvroIdlTokenType(",");
  IElementType DOUBLE = new AvroIdlTokenType("double");
  IElementType ENUM = new AvroIdlTokenType("enum");
  IElementType EQUALS = new AvroIdlTokenType("=");
  IElementType ERROR = new AvroIdlTokenType("error");
  IElementType FALSE = new AvroIdlTokenType("false");
  IElementType FIXED = new AvroIdlTokenType("fixed");
  IElementType FLOAT = new AvroIdlTokenType("float");
  IElementType FLOAT_LITERAL = new AvroIdlTokenType("FLOAT_LITERAL");
  IElementType IDENTIFIER = new AvroIdlTokenType("IDENTIFIER");
  IElementType IDL = new AvroIdlTokenType("idl");
  IElementType IMPORT = new AvroIdlTokenType("import");
  IElementType INT = new AvroIdlTokenType("int");
  IElementType INT_LITERAL = new AvroIdlTokenType("INT_LITERAL");
  IElementType LEFT_ANGLE = new AvroIdlTokenType("<");
  IElementType LEFT_BRACE = new AvroIdlTokenType("{");
  IElementType LEFT_BRACKET = new AvroIdlTokenType("[");
  IElementType LEFT_PAREN = new AvroIdlTokenType("(");
  IElementType LINE_COMMENT = new AvroIdlTokenType("LINE_COMMENT");
  IElementType LONG = new AvroIdlTokenType("long");
  IElementType MAP = new AvroIdlTokenType("map");
  IElementType NULL = new AvroIdlTokenType("null");
  IElementType ONEWAY = new AvroIdlTokenType("oneway");
  IElementType PROTOCOL = new AvroIdlTokenType("protocol");
  IElementType RECORD = new AvroIdlTokenType("record");
  IElementType RIGHT_ANGLE = new AvroIdlTokenType(">");
  IElementType RIGHT_BRACE = new AvroIdlTokenType("}");
  IElementType RIGHT_BRACKET = new AvroIdlTokenType("]");
  IElementType RIGHT_PAREN = new AvroIdlTokenType(")");
  IElementType SCHEMA = new AvroIdlTokenType("schema");
  IElementType SEMICOLON = new AvroIdlTokenType(";");
  IElementType STRING = new AvroIdlTokenType("string");
  IElementType STRING_LITERAL = new AvroIdlTokenType("STRING_LITERAL");
  IElementType THROWS = new AvroIdlTokenType("throws");
  IElementType TRUE = new AvroIdlTokenType("true");
  IElementType UNION = new AvroIdlTokenType("union");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ANNOTATION) {
        return new AvroIdlAnnotationImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new AvroIdlArrayTypeImpl(node);
      }
      else if (type == DECLARATION) {
        return new AvroIdlDeclarationImpl(node);
      }
      else if (type == DECLARATOR) {
        return new AvroIdlDeclaratorImpl(node);
      }
      else if (type == ENUM_DECL) {
        return new AvroIdlEnumDeclImpl(node);
      }
      else if (type == EXPRESSION) {
        return new AvroIdlExpressionImpl(node);
      }
      else if (type == FIXED_DECL) {
        return new AvroIdlFixedDeclImpl(node);
      }
      else if (type == IMPORT_DECL) {
        return new AvroIdlImportDeclImpl(node);
      }
      else if (type == IMPORT_TYPE) {
        return new AvroIdlImportTypeImpl(node);
      }
      else if (type == MAP_TYPE) {
        return new AvroIdlMapTypeImpl(node);
      }
      else if (type == MESSAGE_DECL) {
        return new AvroIdlMessageDeclImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new AvroIdlPrimitiveTypeImpl(node);
      }
      else if (type == PROTOCOL_DEF) {
        return new AvroIdlProtocolDefImpl(node);
      }
      else if (type == RECORD_DECL) {
        return new AvroIdlRecordDeclImpl(node);
      }
      else if (type == RECORD_TYPE) {
        return new AvroIdlRecordTypeImpl(node);
      }
      else if (type == TYPE) {
        return new AvroIdlTypeImpl(node);
      }
      else if (type == UNION_TYPE) {
        return new AvroIdlUnionTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
