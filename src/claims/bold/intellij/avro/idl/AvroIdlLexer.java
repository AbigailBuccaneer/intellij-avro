package claims.bold.intellij.avro.idl;

import com.intellij.lexer.FlexAdapter;

public class AvroIdlLexer extends FlexAdapter {
    public AvroIdlLexer() {
        super(new _AvroIdlLexer(null));
    }
}
