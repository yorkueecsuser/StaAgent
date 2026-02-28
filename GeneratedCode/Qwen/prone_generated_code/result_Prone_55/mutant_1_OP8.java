class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        myLogMethod("My log message: %d and %d", 3, "has a message");
        return "Check console for the bug";
    }

    // Mutated code with renaming operator
    public String showBugMutated() {
        // BUG: FormatStringAnnotation
        myLogMethod("My log message: %d and %d", 3, "has a message");
        String b = "Check console for the bug";
        return b;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
        example.showBugMutated(); // Call to mutated method
    }
}