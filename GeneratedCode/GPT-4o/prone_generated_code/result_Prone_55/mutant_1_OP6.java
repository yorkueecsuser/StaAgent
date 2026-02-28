class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation

        // Mutation: Unreachable for loop
        boolean shouldExecute = getCondition();
        for (int i = 0; shouldExecute; i++) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }

    // Helper method to provide a false condition
    public boolean getCondition() {
        return false;
    }
}