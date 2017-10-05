package claims.bold.intellij.avro.idl.codestyle;

import claims.bold.intellij.avro.idl.AvroIdlLanguage;
import com.intellij.application.options.CodeStyleAbstractConfigurable;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.application.options.TabbedLanguageCodeStylePanel;
import com.intellij.openapi.options.Configurable;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mwilber on 3/5/17.
 */
public class AvroIdlCodeStyleSettingsProvider extends CodeStyleSettingsProvider {
    @NotNull
    @Override
    public Configurable createSettingsPage(final CodeStyleSettings settings, final CodeStyleSettings originalSettings) {
        return new CodeStyleAbstractConfigurable(settings, originalSettings, AvroIdlLanguage.INSTANCE.getDisplayName()) {

            @Override
            protected CodeStyleAbstractPanel createPanel(final CodeStyleSettings settings) {
                final CodeStyleSettings currentSettings = getCurrentSettings();
                return new TabbedLanguageCodeStylePanel(AvroIdlLanguage.INSTANCE, currentSettings, settings) {

                    @Override
                    protected void initTabs(final CodeStyleSettings settings) {
                        addIndentOptionsTab(settings);
                    }

                };
            }

            @Override
            public String getHelpTopic() {
                return null;
            }
        };
    }

    @Override
    public String getConfigurableDisplayName() {
        return AvroIdlLanguage.INSTANCE.getDisplayName();
    }
}