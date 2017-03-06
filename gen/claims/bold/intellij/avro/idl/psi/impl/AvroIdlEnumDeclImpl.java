// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static claims.bold.intellij.avro.idl.psi.AvroIdlTypes.*;
import claims.bold.intellij.avro.idl.psi.*;

public class AvroIdlEnumDeclImpl extends AvroIdlDeclarationImpl implements AvroIdlEnumDecl {

  public AvroIdlEnumDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AvroIdlVisitor visitor) {
    visitor.visitEnumDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) accept((AvroIdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AvroIdlAnnotation getAnnotation() {
    return findChildByClass(AvroIdlAnnotation.class);
  }

  @Override
  @NotNull
  public List<AvroIdlEnumValue> getEnumValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AvroIdlEnumValue.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Nullable
  public PsiElement getNameIdentifier() {
    return AvroIdlPsiUtil.getNameIdentifier(this);
  }

  @Nullable
  @NonNls
  public String getName() {
    return AvroIdlPsiUtil.getName(this);
  }

  public PsiElement setName(String name) {
    return AvroIdlPsiUtil.setName(this, name);
  }

}
