import java.math.BigDecimal;

class FloatMathBug {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBug2() {
        float x = 16777216.0f; // Mutated variable name from 'a' to 'x'
        float y = 1.0f; // Mutated variable name from 'b' to 'y'
        double d = x + y; // BUG: Math should not be performed on floats
        return d;
    }

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
        System.out.println("Result of showBug2: " + bugDemo.showBug2());
    }
}