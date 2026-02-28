class NullPointerExceptionBug {
    private String nullString;

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        int condition = getCondition();
        switch (condition) {
            case 1:
                System.out.println("This case will never be reached");
                break;
        }
        return "Length: " + nullString.length(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    private int getCondition() {
        // This method always returns a value that is not 1 to ensure the switch statement is unreachable
        return 0;
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