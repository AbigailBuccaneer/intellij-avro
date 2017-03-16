package claims.bold.intellij.avro.idl.formatter;

import claims.bold.intellij.avro.idl.psi.AvroIdlTypes;
import com.google.common.collect.Sets;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static claims.bold.intellij.avro.idl.psi.AvroIdlTypes.*;

/**
 * Created by mwilber on 3/4/17.
 */
public class AvroIdlBlock extends AbstractBlock {

    private SpacingBuilder spacingBuilder;
    private static final Set<IElementType> ELEMENT_TYPES_TO_INDENT = Sets.newHashSet(
            DECLARATOR, RECORD_DECL, ENUM_DECL, FIXED_DECL, ENUM_VALUE, MESSAGE_DECL, IMPORT_DECL
    );

    protected AvroIdlBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment,
                           SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;

    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<Block>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {
            if (child.getElementType() != TokenType.WHITE_SPACE) {
                Block block = new AvroIdlBlock(child, Wrap.createWrap(WrapType.NONE, false), Alignment.createAlignment(),
                        spacingBuilder);
                blocks.add(block);
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    @Override
    public Indent getIndent() {
        if (ELEMENT_TYPES_TO_INDENT.contains(myNode.getElementType())) {
            return Indent.getNormalIndent();
        }
        return Indent.getNoneIndent();
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }

}
