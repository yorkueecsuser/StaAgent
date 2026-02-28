class NullPointerDereferenceBug {

    private String nullString;
    private String deadStoreVar;  // Dead Store Mutation

    public void initializeString(String str) {
        this.nullString = str;
        this.deadStoreVar = "unused";  // Initialize deadStoreVar to avoid null pointer
    }

    public void showBug() {
        System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}