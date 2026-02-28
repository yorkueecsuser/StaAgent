class NullPointerExceptionBug {
    private String nullString;

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code should never be executed");
        }
        return "Length: " + nullString.length(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    public boolean getCondition() {
        return false; // This method is used to return a dynamically determined condition
    }

    public void showBug() {
        initialize();
        System.out.println(getNullStringLength()); // This will throw a NullPointerException
    }

    public static void main(String[] args) {
        NullPointerExceptionBug bug = new NullPointerExceptionBug();
        bug.showBug();
    }
}