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

public class AvroIdlImportDeclImpl extends AvroIdlDeclarationImpl implements AvroIdlImportDecl {

  public AvroIdlImportDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AvroIdlVisitor visitor) {
    visitor.visitImportDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) accept((AvroIdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AvroIdlAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AvroIdlAnnotation.class);
  }

  @Override
  @Nullable
  public AvroIdlImportType getImportType() {
    return findChildByClass(AvroIdlImportType.class);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
