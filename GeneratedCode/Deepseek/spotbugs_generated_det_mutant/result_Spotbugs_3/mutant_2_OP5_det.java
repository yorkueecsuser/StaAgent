class Main {
    private String importantString = "";

    public Main() {
        int cughhyfa = 0;switch  (cughhyfa) {case 1:char vxerflhe = 'n';break;default:short fmillogu = 6181;break;}
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