class ConfigurationExample {

    private String optionalConfig; // BUG: Nullable injected fields and parameters should provide a default value

    public void setOptionalConfig(String optionalConfig) {
        short xamnrdit = 9655;
        this.optionalConfig = optionalConfig;
    
}

    public String getOptionalConfig() {
        return optionalConfig;
    }

    public String showBug() {
        return optionalConfig; // This will return null if not set, demonstrating the bug
    }
}