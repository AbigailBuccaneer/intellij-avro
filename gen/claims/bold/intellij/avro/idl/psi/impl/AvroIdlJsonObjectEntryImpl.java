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

public class AvroIdlJsonObjectEntryImpl extends ASTWrapperPsiElement implements AvroIdlJsonObjectEntry {

  public AvroIdlJsonObjectEntryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) ((AvroIdlVisitor)visitor).visitJsonObjectEntry(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AvroIdlJsonValue getJsonValue() {
    return findNotNullChildByClass(AvroIdlJsonValue.class);
  }

  @Override
  @NotNull
  public PsiElement getStringLiteral() {
    return findNotNullChildByType(STRING_LITERAL);
  }

}
