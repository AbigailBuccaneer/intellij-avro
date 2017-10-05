package claims.bold.intellij.avro.idl.formatter;

import claims.bold.intellij.avro.idl.AvroIdlLanguage;
import claims.bold.intellij.avro.idl.psi.AvroIdlTypes;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mwilber on 3/4/17.
 */
public class AvroIdlFormattingModelBuilder implements FormattingModelBuilder {

    @NotNull
    @Override
    public FormattingModel createModel(PsiElement psiElement, CodeStyleSettings codeStyleSettings) {
        return FormattingModelProvider.createFormattingModelForPsiFile(
                psiElement.getContainingFile(),
                new AvroIdlBlock(
                        psiElement.getNode(),
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        createSpaceBuilder(codeStyleSettings)),
                codeStyleSettings
        );
    }

    private SpacingBuilder createSpaceBuilder(CodeStyleSettings codeStyleSettings) {
        return new SpacingBuilder(codeStyleSettings, AvroIdlLanguage.INSTANCE);
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile psiFile, int i, ASTNode astNode) {
        return null;
    }

}
