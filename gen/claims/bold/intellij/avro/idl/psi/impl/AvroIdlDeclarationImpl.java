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

public class AvroIdlDeclarationImpl extends ASTWrapperPsiElement implements AvroIdlDeclaration {

  public AvroIdlDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) ((AvroIdlVisitor)visitor).visitDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AvroIdlAnnotation getAnnotation() {
    return findChildByClass(AvroIdlAnnotation.class);
  }

  @Override
  @Nullable
  public AvroIdlEnumDecl getEnumDecl() {
    return findChildByClass(AvroIdlEnumDecl.class);
  }

  @Override
  @Nullable
  public AvroIdlFixedDecl getFixedDecl() {
    return findChildByClass(AvroIdlFixedDecl.class);
  }

  @Override
  @Nullable
  public AvroIdlImportDecl getImportDecl() {
    return findChildByClass(AvroIdlImportDecl.class);
  }

  @Override
  @Nullable
  public AvroIdlMessageDecl getMessageDecl() {
    return findChildByClass(AvroIdlMessageDecl.class);
  }

  @Override
  @Nullable
  public AvroIdlRecordDecl getRecordDecl() {
    return findChildByClass(AvroIdlRecordDecl.class);
  }

}
