package claims.bold.intellij.avro.idl;

import com.intellij.openapi.util.Condition;
import com.intellij.openapi.vfs.VirtualFile;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by abigail on 06/10/15.
 */
public class AvroIdlProblemFileHighlightFilter implements Condition<VirtualFile> {
    @Override
    public boolean value(VirtualFile virtualFile) {
        return virtualFile.getFileType() instanceof AvroIdlFileType;
    }
}
