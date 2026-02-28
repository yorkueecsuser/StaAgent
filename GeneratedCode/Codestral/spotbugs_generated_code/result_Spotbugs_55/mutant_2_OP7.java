class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        // Inserted mutant: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop is unreachable because the condition is always false.
            // It will never execute any code inside the loop.
        }

        System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}