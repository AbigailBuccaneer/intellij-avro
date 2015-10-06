// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AvroIdlProtocolDef extends PsiElement {

  @Nullable
  AvroIdlAnnotation getAnnotation();

  @NotNull
  List<AvroIdlDeclaration> getDeclarationList();

  @Nullable
  PsiElement getIdentifier();

}
