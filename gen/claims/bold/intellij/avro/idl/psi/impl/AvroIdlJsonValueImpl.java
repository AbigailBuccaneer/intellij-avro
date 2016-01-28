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

public class AvroIdlJsonValueImpl extends ASTWrapperPsiElement implements AvroIdlJsonValue {

  public AvroIdlJsonValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AvroIdlVisitor) ((AvroIdlVisitor)visitor).visitJsonValue(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AvroIdlJsonArray getJsonArray() {
    return findChildByClass(AvroIdlJsonArray.class);
  }

  @Override
  @Nullable
  public AvroIdlJsonObject getJsonObject() {
    return findChildByClass(AvroIdlJsonObject.class);
  }

  @Override
  @Nullable
  public PsiElement getFloatLiteral() {
    return findChildByType(FLOAT_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getIntLiteral() {
    return findChildByType(INT_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
