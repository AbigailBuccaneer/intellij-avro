// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class AvroIdlVisitor extends PsiElementVisitor {

  public void visitAnnotation(@NotNull AvroIdlAnnotation o) {
    visitPsiElement(o);
  }

  public void visitArrayType(@NotNull AvroIdlArrayType o) {
    visitType(o);
  }

  public void visitDeclaration(@NotNull AvroIdlDeclaration o) {
    visitPsiElement(o);
  }

  public void visitDeclarator(@NotNull AvroIdlDeclarator o) {
    visitPsiElement(o);
  }

  public void visitEnumDecl(@NotNull AvroIdlEnumDecl o) {
    visitDeclaration(o);
  }

  public void visitExpression(@NotNull AvroIdlExpression o) {
    visitPsiElement(o);
  }

  public void visitFixedDecl(@NotNull AvroIdlFixedDecl o) {
    visitDeclaration(o);
  }

  public void visitImportDecl(@NotNull AvroIdlImportDecl o) {
    visitDeclaration(o);
  }

  public void visitImportType(@NotNull AvroIdlImportType o) {
    visitType(o);
  }

  public void visitMapType(@NotNull AvroIdlMapType o) {
    visitType(o);
  }

  public void visitMessageDecl(@NotNull AvroIdlMessageDecl o) {
    visitDeclaration(o);
  }

  public void visitPrimitiveType(@NotNull AvroIdlPrimitiveType o) {
    visitType(o);
  }

  public void visitProtocolDef(@NotNull AvroIdlProtocolDef o) {
    visitPsiElement(o);
  }

  public void visitRecordDecl(@NotNull AvroIdlRecordDecl o) {
    visitDeclaration(o);
  }

  public void visitRecordType(@NotNull AvroIdlRecordType o) {
    visitType(o);
  }

  public void visitType(@NotNull AvroIdlType o) {
    visitPsiElement(o);
  }

  public void visitUnionType(@NotNull AvroIdlUnionType o) {
    visitType(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
