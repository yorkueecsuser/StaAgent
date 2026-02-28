class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        myLogMethod("My log message: %d and %d", 3, "has a message");
        // Mutant: Duplicating the assignment statement
        myLogMethod("My log message: %d and %d", 3, "has a message");
        return "Check console for the bug";
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
        // Mutant: Duplicating the assignment statement
        FormatStringBugExample example2 = new FormatStringBugExample();
        example2.showBug();
    }
}