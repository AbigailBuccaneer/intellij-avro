package claims.bold.intellij.avro.idl.structure;

import claims.bold.intellij.avro.idl.psi.AvroIdlTypes;
import com.intellij.icons.AllIcons;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.structureView.impl.common.PsiTreeElementBase;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AvroIdlStructureViewElement extends PsiTreeElementBase<PsiElement> {

    protected AvroIdlStructureViewElement(PsiElement psiElement) {
        super(psiElement);
    }

    @NotNull
    @Override
    public Collection<StructureViewTreeElement> getChildrenBase() {
        List<StructureViewTreeElement> children = new ArrayList<>();
        for (PsiNamedElement element : PsiTreeUtil.getChildrenOfTypeAsList(getValue(), PsiNamedElement.class)) {
            children.add(new AvroIdlStructureViewElement(element));
        }
        return children;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        if (getValue() instanceof PsiNamedElement) {
            return ((PsiNamedElement) getValue()).getName();
        }
        return getValue().getNode().getElementType().toString();
    }

    @Override
    public Icon getIcon(boolean open) {
        IElementType type = getValue().getNode().getElementType();
        if (type == AvroIdlTypes.PROTOCOL_DEF) {
            return AllIcons.Nodes.Package;
        }
        else if (type == AvroIdlTypes.ENUM_DECL) {
            return AllIcons.Nodes.Enum;
        }
        else if (type == AvroIdlTypes.FIXED_DECL) {
            return AllIcons.Nodes.Class;
        }
        else if (type == AvroIdlTypes.MESSAGE_DECL) {
            return AllIcons.Nodes.Method;
        }
        else if (type == AvroIdlTypes.DECLARATOR) {
            return AllIcons.Nodes.Field;
        }
        else if (type == AvroIdlTypes.ENUM_VALUE) {
            return AllIcons.Nodes.Field;
        }
        else if (type == AvroIdlTypes.RECORD_DECL) {
            return AllIcons.Nodes.Class;
        }

        return null;
    }
}
