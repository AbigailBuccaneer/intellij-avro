package claims.bold.intellij.avro.idl;

import claims.bold.intellij.avro.idl.psi.AvroIdlTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AvroIdlFoldingBuilder implements FoldingBuilder, DumbAware {
    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
        final List<FoldingDescriptor> descriptors = new ArrayList<>();
        collectDescriptorsRecursively(node, document, descriptors);
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    private static void collectDescriptorsRecursively(@NotNull ASTNode node,
                                                      @NotNull Document document,
                                                      @NotNull List<FoldingDescriptor> descriptors) {
        if (!spanMultipleLines(node, document)) return;

        if (node.findChildByType(AvroIdlTypes.LEFT_BRACE) != null || node.getElementType() == AvroIdlTypes.BLOCK_COMMENT) {
            descriptors.add(new FoldingDescriptor(node, getBracedRange(node)));
        }

        for (ASTNode child : node.getChildren(null)) {
            collectDescriptorsRecursively(child, document, descriptors);
        }
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        if (node.getElementType() == AvroIdlTypes.BLOCK_COMMENT) {
            return "/*...*/";
        }
        else {
            return "{...}";
        }
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }

    private static boolean spanMultipleLines(@NotNull ASTNode node, @NotNull Document document) {
        final TextRange range = node.getTextRange();
        return document.getLineNumber(range.getStartOffset()) < document.getLineNumber(range.getEndOffset());
    }

    private static TextRange getBracedRange(@NotNull ASTNode node) {
        ASTNode leftBrace = node.findChildByType(AvroIdlTypes.LEFT_BRACE);
        ASTNode rightBrace = node.findChildByType(AvroIdlTypes.RIGHT_BRACE);

        return new TextRange(leftBrace != null ? leftBrace.getStartOffset() : node.getStartOffset(),
                             rightBrace != null ? rightBrace.getTextRange().getEndOffset() : node.getTextRange().getEndOffset());
    }
}
