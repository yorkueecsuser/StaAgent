class ConfigurationExample {

    private String optionalConfig; // BUG: Nullable injected fields and parameters should provide a default value

    public void setOptionalConfig(String optionalConfig) {
        int yjjdimie = 0;switch  (yjjdimie) {case 1:float bycglipv = -463870018;break;default:float hexibsiz = 922986771;break;}
        this.optionalConfig = optionalConfig;
    
}

    public String getOptionalConfig() {
        return optionalConfig;
    }

    public String showBug() {
        return optionalConfig; // This will return null if not set, demonstrating the bug
    }
}