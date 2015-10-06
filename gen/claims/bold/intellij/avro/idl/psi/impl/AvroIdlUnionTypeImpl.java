// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static claims.bold.intellij.avro.idl.psi.AvroIdlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import claims.bold.intellij.avro.idl.psi.*;

public class AvroIdlUnionTypeImpl extends ASTWrapperPsiElement implements AvroIdlUnionType {

  public AvroIdlUnionTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) ((AvroIdlVisitor)visitor).visitUnionType(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AvroIdlType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AvroIdlType.class);
  }

}
