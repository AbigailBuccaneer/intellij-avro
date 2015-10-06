package claims.bold.intellij.avro.idl.psi;

import claims.bold.intellij.avro.idl.AvroIdlLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;

/**
 * Created by abigail on 06/10/15.
 */
public class AvroIdlElementType extends IElementType {
    public AvroIdlElementType(String debugName) {
        super(debugName, AvroIdlLanguage.INSTANCE);
    }
}
