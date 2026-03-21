class Main {
    private String importantString = "";

    public Main() {
        boolean bygeowuc = false;while (bygeowuc && false && true && true && false && true && false && true && true && false && false && false) {double gpyjtdxb = -794440967;}
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