// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AvroIdlRecordDecl extends AvroIdlDeclaration {

  @Nullable
  AvroIdlAnnotation getAnnotation();

  @NotNull
  List<AvroIdlDeclarator> getDeclaratorList();

  @NotNull
  AvroIdlRecordType getRecordType();

  @Nullable
  PsiElement getIdentifier();

}
