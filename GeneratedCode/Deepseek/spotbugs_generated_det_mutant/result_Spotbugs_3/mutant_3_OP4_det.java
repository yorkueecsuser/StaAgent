class Main {
    private String importantString = "";

    public Main() {
        if (false && true && false && false && false && false && false && false && true && false && false) {int epjicjqi = 922675594;}else{byte hppsbods = -35;}
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