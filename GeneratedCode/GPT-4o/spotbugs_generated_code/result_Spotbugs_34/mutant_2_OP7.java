class ConfusingMethodNames {

    // Method with lowercase name
    public int calculateValue(int a, int b) {
        // Unreachable while loop added
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("Unreachable code in calculateValue");
        }
        
        return a + b;
    }

    // Method with uppercase name, same name except for capitalization
    public int CalculateValue(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        // Unreachable while loop added
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("Unreachable code in CalculateValue");
        }
        
        return a * b; // Different implementation
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
    
    // Helper method to provide a runtime false condition
    private boolean getFalseCondition() {
        return false;
    }
}