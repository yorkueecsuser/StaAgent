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

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method returns a constant value that is not in the switch cases
        switch (unreachableValue) {
            case 100:
                // Unreachable code
                System.out.println("This is unreachable");
                break;
            default:
                break;
        }

        return result1 - result2; // Demonstrates difference in behavior
    }

    private int getUnreachableValue() {
        return 200; // Value not handled in switch cases
    }

    public static void main(String[] args) {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}