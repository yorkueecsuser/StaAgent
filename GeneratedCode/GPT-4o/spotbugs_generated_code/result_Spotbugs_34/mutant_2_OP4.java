class ConfusingMethodNames {

    // Method with lowercase name
    public int calculateValue(int a, int b) {
        // Unreachable if-else branch added
        boolean condition = getCondition(); // This method dynamically determines the condition
        if (condition) {
            // This block will never be reached
            return 0;
        } else {
            return a + b;
        }
    }

    // Method with uppercase name, same name except for capitalization
    public int CalculateValue(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        // Unreachable if-else branch added
        boolean condition = getCondition(); // This method dynamically determines the condition
        if (condition) {
            // This block will never be reached
            return 0;
        } else {
            return a * b; // Different implementation
        }
    }

    public int showBug(int a, int b) {
        // Demonstrates the bug by calling both methods
        int result1 = calculateValue(a, b);
        int result2 = CalculateValue(a, b);
        return result1 - result2; // Demonstrates difference in behavior
    }

    public static void main(String[] args) {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
    
    private boolean getCondition() {
        return false; // This will make the condition always false, thus making the branch unreachable
    }
}