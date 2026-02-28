class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        // Introduced an unreachable while loop with a dynamic condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
        }
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
    }

    // Method to demonstrate the bug
    public String showBug() {
        // Introduced an unreachable while loop with a dynamic condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
        }
        return processString(null); // BUG: DangerousLiteralNull
    }

    // Helper method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}