package claims.bold.intellij.avro.idl.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AvroIdlPsiUtil {
    @Nullable
    public static PsiElement getNameIdentifier(@NotNull PsiNameIdentifierOwner owner) {
        ASTNode nameNode = owner.getNode().findChildByType(AvroIdlTypes.IDENTIFIER);
        return nameNode != null ? nameNode.getPsi() : null;
    }

    @Nullable @NonNls
    public static String getName(@NotNull PsiNameIdentifierOwner owner) {
        PsiElement id = getNameIdentifier(owner);
        return id != null ? id.getText() : null;
    }

    public static PsiElement setName(@NotNull PsiNameIdentifierOwner owner, @NonNls @NotNull String name) throws IncorrectOperationException {
        throw new IncorrectOperationException();
    }
}
