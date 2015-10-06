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

public class AvroIdlRecordDeclImpl extends AvroIdlDeclarationImpl implements AvroIdlRecordDecl {

  public AvroIdlRecordDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) ((AvroIdlVisitor)visitor).visitRecordDecl(this);
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
  public AvroIdlRecordType getRecordType() {
    return findNotNullChildByClass(AvroIdlRecordType.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
