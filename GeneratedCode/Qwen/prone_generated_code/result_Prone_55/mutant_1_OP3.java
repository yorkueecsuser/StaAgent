class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        myLogMethod("My log message: %d and %d", 3, "has a message");
        
        // Introduced Unreachable if statement mutant
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement");
        }
        
        return "Check console for the bug";
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}