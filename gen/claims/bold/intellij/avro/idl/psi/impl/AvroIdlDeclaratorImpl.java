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

public class AvroIdlDeclaratorImpl extends ASTWrapperPsiElement implements AvroIdlDeclarator {

  public AvroIdlDeclaratorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) ((AvroIdlVisitor)visitor).visitDeclarator(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AvroIdlAnnotation getAnnotation() {
    return findChildByClass(AvroIdlAnnotation.class);
  }

  @Override
  @Nullable
  public AvroIdlJsonValue getJsonValue() {
    return findChildByClass(AvroIdlJsonValue.class);
  }

  @Override
  @NotNull
  public AvroIdlType getType() {
    return findNotNullChildByClass(AvroIdlType.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
