class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats
        return d;
    }

    // Mutated method with renamed variable
    public float showBugMutant1() {
        float x = 16777216.0f;  // Renamed 'a' to 'x'
        float b = 1.0f;
        float c = x + b; // Math should not be performed on floats
        return c;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
        System.out.println("Result of showBugMutant1: " + demo.showBugMutant1());
    }
}