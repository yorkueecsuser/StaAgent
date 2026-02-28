class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
        
        // Introduce an unreachable if statement based on a non-final variable
        boolean condition = shouldExecute();
        if (condition) {
            System.out.println("This should never print");
        }
    }

    // Method that always returns false
    private boolean shouldExecute() {
        return false;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}