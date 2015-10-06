package claims.bold.intellij.avro.idl;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

/**
 * Created by abigail on 06/10/15.
 */
public class AvroIdlFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(FileTypeConsumer consumer) {
        consumer.consume(AvroIdlFileType.INSTANCE, "avdl");
    }
}
