class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
        int duplicatedValue = 0; // An assignment statement without method invocation
        duplicatedValue = 0; // Duplicated assignment statement
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}