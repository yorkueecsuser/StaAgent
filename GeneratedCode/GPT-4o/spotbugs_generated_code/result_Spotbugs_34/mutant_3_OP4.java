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
        // Demonstrates the bug by calling both methods
        int result1 = calculateValue(a, b);
        int result2 = CalculateValue(a, b);

        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable block");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block");
        }

        return result1 - result2; // Demonstrates difference in behavior
    }

    // Helper method to ensure the if condition is dynamically determined
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}