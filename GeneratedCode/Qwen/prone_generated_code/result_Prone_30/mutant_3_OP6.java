class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
    }

    // Method to demonstrate the bug
    public String showBug() {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
        return processString(null); // BUG: DangerousLiteralNull
    }

    public static void main(String[] args) {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // Helper method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}