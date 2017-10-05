package claims.bold.intellij.avro.idl.psi;

import claims.bold.intellij.avro.idl.AvroIdlLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;

/**
 * Created by abigail on 06/10/15.
 */
public class AvroIdlTokenType extends IElementType {
    public AvroIdlTokenType(String debugName) {
        super(debugName, AvroIdlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "AvroIdlTokenType." + super.toString();
    }
}
