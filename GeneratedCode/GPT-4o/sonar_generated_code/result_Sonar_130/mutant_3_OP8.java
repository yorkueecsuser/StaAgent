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

    public float showBugMutant() {
        float x = 16777216.0f; // Renamed 'a' to 'x'
        float b = 1.0f;
        float c = x + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBugWithDoubleMutant() {
        float y = 16777216.0f; // Renamed 'a' to 'y'
        float b = 1.0f;
        double d = y + b; // BUG: Math should not be performed on floats
        return d;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
        System.out.println("Result of showBugMutant: " + demo.showBugMutant());
        System.out.println("Result of showBugWithDoubleMutant: " + demo.showBugWithDoubleMutant());
    }
}