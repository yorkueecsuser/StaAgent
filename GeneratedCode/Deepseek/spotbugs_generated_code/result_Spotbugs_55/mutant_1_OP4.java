class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        boolean unreachableCondition = false;

        if (unreachableCondition) {
            // Unreachable code block
            System.out.println("This code block is unreachable.");
        } else {
            // Original code
            System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        }
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}