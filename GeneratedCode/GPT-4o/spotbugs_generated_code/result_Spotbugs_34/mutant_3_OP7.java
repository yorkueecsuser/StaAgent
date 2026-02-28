class ConfusingMethodNames {

    // Method with lowercase name
    public int calculateValue(int a, int b) {
        return a + b;
    }

    // Method with uppercase name, same name except for capitalization
    public int CalculateValue(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a * b; // Different implementation
    }

    public int showBug(int a, int b) {
        // Demonstrates the bug by calling both methods
        int result1 = calculateValue(a, b);
        int result2 = CalculateValue(a, b);

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition(); // Ensures condition is dynamically determined
        while (conditionWhile) {
            System.out.println("This line is unreachable.");
        }

        return result1 - result2; // Demonstrates difference in behavior
    }

    // Dummy method to ensure dynamic condition
    private boolean getCondition() {
        return false; // Ensures while loop is unreachable
    }

    public static void main(String[] args) {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}