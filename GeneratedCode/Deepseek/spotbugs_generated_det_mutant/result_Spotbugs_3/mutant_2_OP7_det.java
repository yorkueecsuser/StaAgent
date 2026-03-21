class Main {
    private String importantString = "";

    public Main() {
        boolean gmwptdiq = false;while (gmwptdiq && false && false && false && true && false && false && false && true && true && false && false) {char xjdtqhqa = 'u';}
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