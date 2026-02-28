class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never execute.");
        }
    }

    // Dynamically determines the loop condition, making it always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}