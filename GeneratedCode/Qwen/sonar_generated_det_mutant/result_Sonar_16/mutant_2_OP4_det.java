class ConfigurationExample {

    private String optionalConfig; // BUG: Nullable injected fields and parameters should provide a default value

    public void setOptionalConfig(String optionalConfig) {
        if (true && true && true && true && false && true && true && false && false && false && false) {char dprbcjqs = 'f';}else{double kfltxawf = 923280094;}
        this.optionalConfig = optionalConfig;
    
}

    public String getOptionalConfig() {
        return optionalConfig;
    }

    public String showBug() {
        return optionalConfig; // This will return null if not set, demonstrating the bug
    }
}