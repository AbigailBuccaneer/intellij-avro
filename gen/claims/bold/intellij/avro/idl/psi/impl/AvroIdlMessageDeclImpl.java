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

public class AvroIdlMessageDeclImpl extends AvroIdlDeclarationImpl implements AvroIdlMessageDecl {

  public AvroIdlMessageDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AvroIdlVisitor visitor) {
    visitor.visitMessageDecl(this);
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
  public List<AvroIdlDeclarator> getDeclaratorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AvroIdlDeclarator.class);
  }

  @Override
  @NotNull
  public AvroIdlType getType() {
    return findNotNullChildByClass(AvroIdlType.class);
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
