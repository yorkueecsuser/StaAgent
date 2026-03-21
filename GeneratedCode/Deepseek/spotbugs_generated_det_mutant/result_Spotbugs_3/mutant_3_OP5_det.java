class Main {
    private String importantString = "";

    public Main() {
        int wqoxcrsp = 0;switch  (wqoxcrsp) {case 1:char phcapmgn = 'f';break;default:float ieqklkcr = -714766737;break;}
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