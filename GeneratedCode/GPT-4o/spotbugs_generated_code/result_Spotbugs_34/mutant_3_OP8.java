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
        return result1 - result2; // Demonstrates difference in behavior
    }

    public static void main(String[] args) {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}

// Mutant class with a renamed variable
class ConfusingMethodNamesMutant {

    // Method with lowercase name
    public int calculateValue(int x, int y) { // Renamed variables from 'a' to 'x' and 'b' to 'y'
        return x + y;
    }

    // Method with uppercase name, same name except for capitalization
    public int CalculateValue(int x, int y) { // Renamed variables from 'a' to 'x' and 'b' to 'y'
        return x * y; // Different implementation
    }

    public int showBug(int x, int y) { // Renamed variables from 'a' to 'x' and 'b' to 'y'
        // Demonstrates the bug by calling both methods
        int result1 = calculateValue(x, y);
        int result2 = CalculateValue(x, y);
        return result1 - result2; // Demonstrates difference in behavior
    }

    public static void main(String[] args) {
        ConfusingMethodNamesMutant instance = new ConfusingMethodNamesMutant();
        int result = instance.showBug(2, 3);
        System.out.println("Result: " + result);
    }
}