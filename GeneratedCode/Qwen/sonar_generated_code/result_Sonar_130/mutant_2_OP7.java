import java.math.BigDecimal;

class FloatMathBug {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            a = a + 0.1f;
        }

        return c;
    }

    public double showBug2() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            b = b + 0.1f;
        }

        return d;
    }

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
        System.out.println("Result of showBug2: " + bugDemo.showBug2());
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
    }
}