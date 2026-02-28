class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        String deadStore = "unusedVar";  // Mutation: Dead Store
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
        // The result will be 1.6777216E7 instead of 1.6777217E7
    }
}