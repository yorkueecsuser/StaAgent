class Main {
    private String importantString = "";

    public Main() {
        if (false && false && false && true && true && false && false && true && true && true && false) {boolean xhxuudgt = false;}else{double jroejozz = -832225450;}
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