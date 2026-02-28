class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        }
        System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}