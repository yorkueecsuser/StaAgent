import java.math.BigDecimal;

class FloatMathBug {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            a = 0.0f;
            b = 0.0f;
            c = a + b;
        } else {
            // This block should also never execute
            a = 1.0f;
            b = 1.0f;
            c = a - b;
        }

        return c;
    }

    public double showBug2() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            a = 0.0f;
            b = 0.0f;
            d = a + b;
        } else {
            // This block should also never execute
            a = 1.0f;
            b = 1.0f;
            d = a - b;
        }

        return d;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
        System.out.println("Result of showBug2: " + bugDemo.showBug2());
    }
}