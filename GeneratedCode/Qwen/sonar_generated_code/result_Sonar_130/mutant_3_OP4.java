import java.math.BigDecimal;

class FloatMathBug {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            a = a + 0.1f; // This line is reachable
        } else {
            b = b + 0.1f; // This line is unreachable
        }

        return c;
    }

    public double showBug2() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            a = a + 0.1f; // This line is reachable
        } else {
            b = b + 0.1f; // This line is unreachable
        }

        return d;
    }

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
        System.out.println("Result of showBug2: " + bugDemo.showBug2());
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // Always returns true to ensure the if block is reachable
    }
}