class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        // Added unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This line will never be executed");
        }
        System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}