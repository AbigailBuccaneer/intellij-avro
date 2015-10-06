package claims.bold.intellij.avro.idl;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;

import java.io.Reader;

public class AvroIdlLexer extends FlexAdapter {
    public AvroIdlLexer() {
        super(new _AvroIdlLexer(null));
    }
}
