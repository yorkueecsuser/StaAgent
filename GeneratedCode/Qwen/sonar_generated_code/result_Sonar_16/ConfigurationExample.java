import java.util.Optional;

class ConfigurationExample {

    private String configValue;

    // BUG: Nullable injected fields and parameters should provide a default value
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getConfigValue() {
        return configValue;
    }

    public String showBug() {
        return Optional.ofNullable(configValue).orElse("Default Value");
    }
}