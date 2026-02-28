class NullPointerExceptionBug {
    private String nullString;

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop added
            System.out.println("Unreachable loop executed!");
        }
        return "Length: " + nullString.length(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    public void showBug() {
        initialize();
        System.out.println(getNullStringLength()); // This will still throw a NullPointerException
    }

    public static void main(String[] args) {
        NullPointerExceptionBug bug = new NullPointerExceptionBug();
        bug.showBug();
    }
}