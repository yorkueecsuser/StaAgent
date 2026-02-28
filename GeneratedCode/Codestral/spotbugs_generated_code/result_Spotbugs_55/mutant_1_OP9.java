class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        // Equivalent Loop Replacement - No for/while loop in the original code, so no changes made
        System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}