package claims.bold.intellij.avro.idl;

import claims.bold.intellij.avro.idl.psi.AvroIdlTypes;
import com.intellij.codeInspection.ui.OptionAccessor;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.CodeInsightColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.thaiopensource.xml.dtd.om.Def;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by abigail on 06/10/15.
 */
public class AvroIdlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] BLOCK_COMMENT = new TextAttributesKey[]{ DefaultLanguageHighlighterColors.BLOCK_COMMENT };
    private static final TextAttributesKey[] LINE_COMMENT = new TextAttributesKey[]{ DefaultLanguageHighlighterColors.LINE_COMMENT };
    private static final TextAttributesKey[] BAD_CHAR = new TextAttributesKey[]{ HighlighterColors.BAD_CHARACTER };
    private static final TextAttributesKey[] STRING = new TextAttributesKey[]{ DefaultLanguageHighlighterColors.STRING };
    private static final TextAttributesKey[] NUMBER = new TextAttributesKey[]{DefaultLanguageHighlighterColors.NUMBER };
    private static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

    private static final TextAttributesKey[] TYPES = new TextAttributesKey[]{ DefaultLanguageHighlighterColors.KEYWORD };
    private static final Set<IElementType> TYPE_TOKENS = set(
        AvroIdlTypes.INT, AvroIdlTypes.LONG, AvroIdlTypes.STRING, AvroIdlTypes.BOOLEAN, AvroIdlTypes.FLOAT,
        AvroIdlTypes.DOUBLE, AvroIdlTypes.NULL, AvroIdlTypes.BYTES, AvroIdlTypes.ARRAY, AvroIdlTypes.MAP,
        AvroIdlTypes.UNION);

    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{ DefaultLanguageHighlighterColors.KEYWORD };
    private static final Set<IElementType> KEYWORD_TOKENS = set(
        AvroIdlTypes.PROTOCOL, AvroIdlTypes.IMPORT, AvroIdlTypes.IDL, AvroIdlTypes.SCHEMA, AvroIdlTypes.RECORD,
        AvroIdlTypes.ERROR, AvroIdlTypes.ENUM, AvroIdlTypes.FIXED, AvroIdlTypes.THROWS, AvroIdlTypes.ONEWAY,
        AvroIdlTypes.TRUE, AvroIdlTypes.FALSE);

    private static final <T> Set<T> set(T... elements) {
        Set<T> set = new HashSet<>();
        for ( T element : elements ) { set.add(element); }
        return set;
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new AvroIdlLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(AvroIdlTypes.BLOCK_COMMENT)) return BLOCK_COMMENT;
        if (tokenType.equals(AvroIdlTypes.LINE_COMMENT)) return LINE_COMMENT;
        if (tokenType.equals(AvroIdlTypes.INT_LITERAL)
                || tokenType.equals(AvroIdlTypes.FLOAT_LITERAL)) return NUMBER;

        if (TYPE_TOKENS.contains(tokenType)) return TYPES;
        if (KEYWORD_TOKENS.contains(tokenType)) return KEYWORDS;
        return EMPTY;
    }
}
