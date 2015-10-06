package claims.bold.intellij.avro.idl;

import claims.bold.intellij.avro.idl.psi.AvroIdlTypes;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

/**
 * Created by abigail on 06/10/15.
 */
public class AvroIdlPairedBraceMatcher implements PairedBraceMatcher {
    @Override
    public BracePair[] getPairs() {
        return new BracePair[] {
                new BracePair(AvroIdlTypes.LEFT_BRACE, AvroIdlTypes.RIGHT_BRACE, true),
                new BracePair(AvroIdlTypes.LEFT_BRACKET, AvroIdlTypes.RIGHT_BRACKET, false),
                new BracePair(AvroIdlTypes.LEFT_PAREN, AvroIdlTypes.LEFT_PAREN, false),
                new BracePair(AvroIdlTypes.LEFT_ANGLE, AvroIdlTypes.RIGHT_ANGLE, false)
        };
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(IElementType lbraceType, IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return 0;
    }
}
