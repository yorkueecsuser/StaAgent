class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        // Adding an unreachable for loop
        boolean conditionFor = determineCondition(); // A method to ensure runtime evaluation
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
        
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    // Method to ensure the condition is determined at runtime
    private boolean determineCondition() {
        return false; // This method returns false, making the for loop condition false at runtime
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}