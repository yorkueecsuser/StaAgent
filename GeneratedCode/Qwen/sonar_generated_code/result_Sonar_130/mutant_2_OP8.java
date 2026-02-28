import java.math.BigDecimal;

class FloatMathBug {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBug2() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats
        return d;
    }

    public float showBugWithMutant() {
        float x = 16777216.0f; // Mutant: Renamed 'a' to 'x'
        float b = 1.0f;
        float c = x + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBug2WithMutant() {
        float a = 16777216.0f;
        float y = 1.0f; // Mutant: Renamed 'b' to 'y'
        double d = a + y; // BUG: Math should not be performed on floats
        return d;
    }

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
        System.out.println("Result of showBug2: " + bugDemo.showBug2());
        System.out.println("Result of showBugWithMutant: " + bugDemo.showBugWithMutant());
        System.out.println("Result of showBug2WithMutant: " + bugDemo.showBug2WithMutant());
    }
}