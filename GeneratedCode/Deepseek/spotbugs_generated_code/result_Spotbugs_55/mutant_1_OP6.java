class NullPointerDereferenceBug {

    private String nullString;
    private boolean getCondition() {
        return false;
    }

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        boolean condition = getCondition();
        for(int i = 0; condition; i++) { // Mutation: Unreachable for loop
            System.out.println("Unreachable code");
        }
        System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}