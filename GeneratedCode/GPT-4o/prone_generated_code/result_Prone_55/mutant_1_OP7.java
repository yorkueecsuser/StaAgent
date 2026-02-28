class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        // Introducing a non-final variable for unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is intentionally left empty
        }

        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    // Dummy method to ensure the while loop is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}