class NullPointerDereferenceBug {

    private String nullString;
    private int deadStore; // Added by Dead Store Mutation Operator

    public void initializeString(String str) {
        this.nullString = str;
        deadStore = 10; // Added by Dead Store Mutation Operator
    }

    public void showBug() {
        System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}