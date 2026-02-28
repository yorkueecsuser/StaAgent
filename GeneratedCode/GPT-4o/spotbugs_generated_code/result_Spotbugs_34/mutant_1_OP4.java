class ConfusingMethodNames {

    // Method with lowercase name
    public int calculateValue(int a, int b) {
        return a + b;
    }

    // Method with uppercase name, same name except for capitalization
    public int CalculateValue(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a * b; // Different implementation
    }

    public int showBug(int a, int b) {
        // This is a mutation: unreachable if-else statement
        boolean condition = getCondition(); // Ensures the condition is dynamically determined
        if (condition) {
            // This block is never executed because condition is always false
            System.out.println("This will never print.");
        } else {
            System.out.println("Condition is false, executing else block.");
        }

        // Demonstrates the bug by calling both methods
        int result1 = calculateValue(a, b);
        int result2 = CalculateValue(a, b);
        return result1 - result2; // Demonstrates difference in behavior
    }

    // Method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}