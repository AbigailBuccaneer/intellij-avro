// This is a generated file. Not intended for manual editing.
package claims.bold.intellij.avro.idl.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public class AvroIdlVisitor extends PsiElementVisitor {

  public void visitAnnotation(@NotNull AvroIdlAnnotation o) {
    visitPsiElement(o);
  }

  public void visitArrayType(@NotNull AvroIdlArrayType o) {
    visitType(o);
  }

  public void visitDecimalType(@NotNull AvroIdlDecimalType o) {
    visitType(o);
  }

  public void visitDeclaration(@NotNull AvroIdlDeclaration o) {
    visitPsiElement(o);
  }

  public void visitDeclarator(@NotNull AvroIdlDeclarator o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitEnumDecl(@NotNull AvroIdlEnumDecl o) {
    visitDeclaration(o);
    // visitPsiNameIdentifierOwner(o);
  }

  public void visitEnumValue(@NotNull AvroIdlEnumValue o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitFixedDecl(@NotNull AvroIdlFixedDecl o) {
    visitDeclaration(o);
    // visitPsiNameIdentifierOwner(o);
  }

  public void visitImportDecl(@NotNull AvroIdlImportDecl o) {
    visitDeclaration(o);
  }

  public void visitImportType(@NotNull AvroIdlImportType o) {
    visitType(o);
  }

  public void visitJsonArray(@NotNull AvroIdlJsonArray o) {
    visitPsiElement(o);
  }

  public void visitJsonObject(@NotNull AvroIdlJsonObject o) {
    visitPsiElement(o);
  }

  public void visitJsonObjectEntry(@NotNull AvroIdlJsonObjectEntry o) {
    visitPsiElement(o);
  }

  public void visitJsonValue(@NotNull AvroIdlJsonValue o) {
    visitPsiElement(o);
  }

  public void visitMapType(@NotNull AvroIdlMapType o) {
    visitType(o);
  }

  public void visitMessageDecl(@NotNull AvroIdlMessageDecl o) {
    visitDeclaration(o);
    // visitPsiNameIdentifierOwner(o);
  }

  public void visitPrimitiveType(@NotNull AvroIdlPrimitiveType o) {
    visitType(o);
  }

  public void visitProtocolDef(@NotNull AvroIdlProtocolDef o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitRecordDecl(@NotNull AvroIdlRecordDecl o) {
    visitDeclaration(o);
    // visitPsiNameIdentifierOwner(o);
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

  public void visitPsiNameIdentifierOwner(@NotNull PsiNameIdentifierOwner o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
