package claims.bold.intellij.avro.idl.colors;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.CodeInsightColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.options.colors.AttributesDescriptor;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public interface AvroIdlSyntaxColors {
    TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("AVROIDL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    TextAttributesKey LINE_COMMENT = createTextAttributesKey("AVROIDL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    TextAttributesKey BAD_CHAR = createTextAttributesKey("AVROIDL_BAD_CHAR", HighlighterColors.BAD_CHARACTER);

    TextAttributesKey STRING = createTextAttributesKey("AVROIDL_STRING", DefaultLanguageHighlighterColors.STRING);
    TextAttributesKey NUMBER = createTextAttributesKey("AVROIDL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    TextAttributesKey BRACES = createTextAttributesKey("AVROIDL_BRACES", DefaultLanguageHighlighterColors.BRACES);
    TextAttributesKey PARENTHESES = createTextAttributesKey("AVROIDL_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    TextAttributesKey BRACKETS = createTextAttributesKey("AVROIDL_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);

    TextAttributesKey SEMICOLON = createTextAttributesKey("AVROIDL_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    TextAttributesKey COMMA = createTextAttributesKey("AVROIDL_COMMA", DefaultLanguageHighlighterColors.COMMA);
    TextAttributesKey EQUALS = createTextAttributesKey("AVROIDL_EQUALS", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    TextAttributesKey KEYWORD = createTextAttributesKey("AVROIDL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    TextAttributesKey TYPE = createTextAttributesKey("AVROIDL_TYPE", DefaultLanguageHighlighterColors.KEYWORD);

    TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[] { BLOCK_COMMENT };
    TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[] { LINE_COMMENT };
    TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[] { BAD_CHAR };
    TextAttributesKey[] STRING_KEYS = new TextAttributesKey[] { STRING };
    TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[] { NUMBER };
    TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[] { BRACES };
    TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[] { PARENTHESES };
    TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[] { BRACKETS };
    TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[] { SEMICOLON };
    TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[] { COMMA };
    TextAttributesKey[] EQUALS_KEYS = new TextAttributesKey[] { EQUALS };
    TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[] { KEYWORD };
    TextAttributesKey[] TYPE_KEYS = new TextAttributesKey[] { TYPE };

    AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
        new AttributesDescriptor("Block comment", BLOCK_COMMENT),
        new AttributesDescriptor("Line comment", LINE_COMMENT),
        new AttributesDescriptor("Bad character", BAD_CHAR),
        new AttributesDescriptor("String", STRING),
        new AttributesDescriptor("Number", NUMBER),
        new AttributesDescriptor("Braces", BRACES),
        new AttributesDescriptor("Parentheses", PARENTHESES),
        new AttributesDescriptor("Brackets", BRACKETS),
        new AttributesDescriptor("Semicolon", SEMICOLON),
        new AttributesDescriptor("Comma", COMMA),
        new AttributesDescriptor("Equals", EQUALS),
        new AttributesDescriptor("Keywords", KEYWORD),
        new AttributesDescriptor("Types", TYPE)
    };
}
