class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        myLogMethod("My log message: %d and %d", 3, "has a message");
        
        // Introduced Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true.");
        } else {
            System.out.println("This is an unreachable else block.");
        }

        return "Check console for the bug";
    }

    private boolean getCondition() {
        // This method ensures the condition is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}