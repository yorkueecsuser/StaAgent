class Main {
    private String importantString = "";

    public Main() {
        for  (int gvincivn = 0; gvincivn < 0; gvincivn++) {String rgufbify = "pyyopolw";}
        // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    
}

    public String showBug() {
        return importantString.toUpperCase(); // This will throw a NullPointerException
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}