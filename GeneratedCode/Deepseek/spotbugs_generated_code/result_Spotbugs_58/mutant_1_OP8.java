class NullPointerExceptionBug {
    private String nullString;
    private String renamedVariable; // Mutated code: Added a new variable for renaming

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        return "Length: " + nullString.length(); // Original bug: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    public void showBug() {
        initialize();
        String buggyVariable = getNullStringLength(); // Mutated code: Renamed variable to 'buggyVariable'
        System.out.println(buggyVariable); // This will throw a NullPointerException
    }

    public static void main(String[] args) {
        NullPointerExceptionBug bug = new NullPointerExceptionBug();
        bug.showBug();
    }
}