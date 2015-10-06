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

public class AvroIdlTypeImpl extends ASTWrapperPsiElement implements AvroIdlType {

  public AvroIdlTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) ((AvroIdlVisitor)visitor).visitType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AvroIdlAnnotation getAnnotation() {
    return findChildByClass(AvroIdlAnnotation.class);
  }

  @Override
  @Nullable
  public AvroIdlArrayType getArrayType() {
    return findChildByClass(AvroIdlArrayType.class);
  }

  @Override
  @Nullable
  public AvroIdlMapType getMapType() {
    return findChildByClass(AvroIdlMapType.class);
  }

  @Override
  @Nullable
  public AvroIdlPrimitiveType getPrimitiveType() {
    return findChildByClass(AvroIdlPrimitiveType.class);
  }

  @Override
  @Nullable
  public AvroIdlUnionType getUnionType() {
    return findChildByClass(AvroIdlUnionType.class);
  }

}
