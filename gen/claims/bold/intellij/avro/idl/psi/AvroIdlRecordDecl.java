// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public interface AvroIdlRecordDecl extends AvroIdlDeclaration, PsiNameIdentifierOwner {

  @Nullable
  AvroIdlAnnotation getAnnotation();

  @NotNull
  List<AvroIdlDeclarator> getDeclaratorList();

  @NotNull
  AvroIdlRecordType getRecordType();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getNameIdentifier();

  @Nullable
  @NonNls
  String getName();

  PsiElement setName(String name);

}
