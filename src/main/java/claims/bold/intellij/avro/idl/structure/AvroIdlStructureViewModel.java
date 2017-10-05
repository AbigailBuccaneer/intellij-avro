package claims.bold.intellij.avro.idl.structure;

import claims.bold.intellij.avro.idl.psi.AvroIdlFile;
import claims.bold.intellij.avro.idl.psi.AvroIdlProtocolDef;
import claims.bold.intellij.avro.idl.psi.AvroIdlTypes;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public class AvroIdlStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {
    public AvroIdlStructureViewModel(AvroIdlFile psiFile, Editor editor) {
        super(psiFile, editor, new AvroIdlStructureViewElement(psiFile));
        withSuitableClasses(AvroIdlFile.class, AvroIdlProtocolDef.class);
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        if (element instanceof AvroIdlStructureViewElement) {
            IElementType type = ((PsiElement)element.getValue()).getNode().getElementType();
            return type == AvroIdlTypes.ENUM_VALUE || type == AvroIdlTypes.FIXED_DECL || type == AvroIdlTypes.DECLARATOR;
        }
        return false;
    }
}
