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

public class AvroIdlJsonArrayImpl extends ASTWrapperPsiElement implements AvroIdlJsonArray {

  public AvroIdlJsonArrayImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AvroIdlVisitor visitor) {
    visitor.visitJsonArray(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) accept((AvroIdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AvroIdlJsonValue> getJsonValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AvroIdlJsonValue.class);
  }

}
