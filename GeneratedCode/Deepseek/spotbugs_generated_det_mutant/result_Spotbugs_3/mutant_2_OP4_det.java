class Main {
    private String importantString = "";

    public Main() {
        if (true && true && false && true && true && false && true && true && false && false && false) {float bvnmrgkf = 1621531;}else{char geavufvp = 'i';}
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