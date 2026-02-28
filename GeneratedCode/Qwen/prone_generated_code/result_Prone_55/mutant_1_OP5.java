class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        myLogMethod("My log message: %d and %d", 3, "has a message");
        
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case will always be executed
                System.out.println("This is the reachable case.");
                break;
        }
        
        return "Check console for the bug";
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always evaluate to 1
        return false;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}