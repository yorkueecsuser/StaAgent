class FormatStringBugExample {
    
    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        boolean reachUnreachableCode = getUnreachableCondition();
        if (reachUnreachableCode) {
            System.out.println("This branch is unreachable.");
        } else {
            myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This makes the if branch unreachable at runtime
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}