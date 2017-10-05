// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public interface AvroIdlDeclarator extends PsiNameIdentifierOwner {

  @NotNull
  List<AvroIdlAnnotation> getAnnotationList();

  @Nullable
  AvroIdlJsonValue getJsonValue();

  @NotNull
  AvroIdlType getType();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getNameIdentifier();

  @Nullable
  @NonNls
  String getName();

  PsiElement setName(String name);

}
