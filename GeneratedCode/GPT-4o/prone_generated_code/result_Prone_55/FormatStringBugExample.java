class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        boolean conditionWhile = getCondition(); // Non-final variable for the while loop condition
        while (conditionWhile) {
            // This block will never be executed
            System.out.println("This is an unreachable while loop.");
        }
        
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    private boolean getCondition() {
        return false; // The condition that makes the while loop unreachable
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}