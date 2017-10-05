package claims.bold.intellij.avro.idl.codestyle;

import claims.bold.intellij.avro.idl.AvroIdlLanguage;
import com.intellij.application.options.IndentOptionsEditor;
import com.intellij.lang.Language;
import com.intellij.openapi.application.ApplicationBundle;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by mwilber on 3/5/17.
 */
public class AvroIdlLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {

    @Override
    public CommonCodeStyleSettings getDefaultCommonSettings() {
        CommonCodeStyleSettings defaultSettings = new CommonCodeStyleSettings(AvroIdlLanguage.INSTANCE);
        CommonCodeStyleSettings.IndentOptions indentOptions = defaultSettings.initIndentOptions();
        indentOptions.INDENT_SIZE = 2;
        return defaultSettings;
    }

    @Override
    public IndentOptionsEditor getIndentOptionsEditor() {
        return new AvroIdlIndentOptionsEditor();
    }

    @NotNull
    @Override
    public Language getLanguage() {
        return AvroIdlLanguage.INSTANCE;
    }

    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
        return "@namespace(\"mynamespace\")\n" +
                "protocol MyProtocol {\n" +
                "\n" +
                "    @annotation([\"some\", \"values\"])\n" +
                "    record Employee {\n" +
                "        string name;\n" +
                "        boolean active = true;\n" +
                "        long salary;\n" +
                "    }\n" +
                "\n" +
                "}";
    }

    private class AvroIdlIndentOptionsEditor extends IndentOptionsEditor {

        @Override
        protected void addComponents() {
            addTabOptions();

            myTabSizeField = createIndentTextField();
            myTabSizeLabel = new JLabel(ApplicationBundle.message("editbox.indent.tab.size"));

            myIndentField = createIndentTextField();
            myIndentLabel = new JLabel(ApplicationBundle.message("editbox.indent.indent"));
            add(myIndentLabel, myIndentField);
        }

        public void setEnabled(boolean enabled) {
            // Do nothing
        }
    }

}
