class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        boolean condition = getCondition();
        if (condition) { // This if statement is unreachable as the condition is always false.
            System.out.println("This code is unreachable.");
        }
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    private boolean getCondition() {
        return false; // The condition is always false, making the if block unreachable.
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}