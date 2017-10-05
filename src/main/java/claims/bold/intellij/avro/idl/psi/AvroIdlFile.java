package claims.bold.intellij.avro.idl.psi;

import claims.bold.intellij.avro.idl.AvroIdlFileType;
import claims.bold.intellij.avro.idl.AvroIdlLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Created by abigail on 06/10/15.
 */
public class AvroIdlFile extends PsiFileBase {
    public AvroIdlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, AvroIdlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return AvroIdlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Avro™ IDL file";
    }
}
