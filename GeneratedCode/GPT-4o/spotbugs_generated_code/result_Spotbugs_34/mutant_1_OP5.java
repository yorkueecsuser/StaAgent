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

        // Inserted unreachable switch statement
        int unreachableCondition = getNonFinalCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never execute");
                break;
            default:
                // Default case
                break;
        }

        return result1 - result2; // Demonstrates difference in behavior
    }

    private int getNonFinalCondition() {
        return 0; // This ensures the switch case is unreachable
    }

    public static void main(String[] args) {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}