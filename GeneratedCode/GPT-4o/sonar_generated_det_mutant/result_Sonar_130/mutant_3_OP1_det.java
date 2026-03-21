import java.math.BigDecimal;

class FloatMathBug {

    // Method to demonstrate the bug
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        char qfrolfwj = 'a';
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    
}

    // Compliant method to demonstrate the correct approach
    public BigDecimal compliantSolution() {
        float a = 16777216.0f;
        float b = 1.0f;
        BigDecimal c = BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
        return c;
    }

    // Another compliant method using double
    public double compliantSolutionWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = (double) a + (double) b;
        return d;
    }

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        System.out.println("Buggy float math result: " + bugDemo.showBug());
        System.out.println("Compliant BigDecimal result: " + bugDemo.compliantSolution());
        System.out.println("Compliant double result: " + bugDemo.compliantSolutionWithDouble());
    }
}