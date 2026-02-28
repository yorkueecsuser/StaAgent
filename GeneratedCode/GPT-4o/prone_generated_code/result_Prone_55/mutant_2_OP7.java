class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        boolean conditionWhile = getCondition();  // Variable to ensure the while loop is unreachable
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This code is unreachable");
        }
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
    
    private boolean getCondition() {
        return false; // Ensures that the condition is always false, making the loop unreachable
    }
}