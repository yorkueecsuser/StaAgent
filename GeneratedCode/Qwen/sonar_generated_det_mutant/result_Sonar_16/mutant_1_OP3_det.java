class ConfigurationExample {

    private String optionalConfig; // BUG: Nullable injected fields and parameters should provide a default value

    public void setOptionalConfig(String optionalConfig) {
        if (false && false && true && true && false && true && true && false && false && false && false) {short aqkwmvui = 1276;}
        this.optionalConfig = optionalConfig;
    
}

    public String getOptionalConfig() {
        return optionalConfig;
    }

    public String showBug() {
        return optionalConfig; // This will return null if not set, demonstrating the bug
    }
}