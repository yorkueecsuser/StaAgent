class ConfusingMethodNames {

    // Method with lowercase name
    public int calculateValue(int x, int y) {
        return x + y;
    }

    // Method with uppercase name, same name except for capitalization
    public int CalculateValue(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a * b; // Different implementation
    }

    public int showBug(int a, int b) {
        // Demonstrates the bug by calling both methods
        int u = calculateValue(a, b);
        int result2 = CalculateValue(a, b);
        return u - result2; // Demonstrates difference in behavior
    }

    public static void main(String[] args) {
        ConfusingMethodNames o = new ConfusingMethodNames();
        int result = o.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}