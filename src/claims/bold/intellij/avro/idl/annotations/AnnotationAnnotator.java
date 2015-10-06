package claims.bold.intellij.avro.idl.annotations;

import claims.bold.intellij.avro.idl.colors.AvroIdlSyntaxColors;
import claims.bold.intellij.avro.idl.psi.AvroIdlAnnotation;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;

/**
 * Created by abigail on 06/10/15.
 */
public class AnnotationAnnotator implements Annotator {
    @Override
    public void annotate(PsiElement element, AnnotationHolder holder) {
        if (!(element instanceof AvroIdlAnnotation)) return;

        Annotation annotation = holder.createInfoAnnotation(element, "");
        annotation.setTextAttributes(AvroIdlSyntaxColors.ANNOTATION);
    }
}
