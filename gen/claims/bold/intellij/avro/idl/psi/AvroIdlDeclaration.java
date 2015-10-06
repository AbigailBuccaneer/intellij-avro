// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AvroIdlDeclaration extends PsiElement {

  @Nullable
  AvroIdlAnnotation getAnnotation();

  @Nullable
  AvroIdlEnumDecl getEnumDecl();

  @Nullable
  AvroIdlFixedDecl getFixedDecl();

  @Nullable
  AvroIdlImportDecl getImportDecl();

  @Nullable
  AvroIdlMessageDecl getMessageDecl();

  @Nullable
  AvroIdlRecordDecl getRecordDecl();

}
