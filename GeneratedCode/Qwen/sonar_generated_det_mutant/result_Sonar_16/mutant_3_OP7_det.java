class ConfigurationExample {

    private String optionalConfig; // BUG: Nullable injected fields and parameters should provide a default value

    public void setOptionalConfig(String optionalConfig) {
        boolean xeljixmc = false;while (xeljixmc && true && true && false && true && true && false && true && true && false && false && false) {char kplarafu = 'm';}
        this.optionalConfig = optionalConfig;
    
}

    public String getOptionalConfig() {
        return optionalConfig;
    }

    public String showBug() {
        return optionalConfig; // This will return null if not set, demonstrating the bug
    }
}