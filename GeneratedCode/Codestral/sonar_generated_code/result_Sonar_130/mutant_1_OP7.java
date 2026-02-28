class FloatMathBug {
    private boolean getCondition() {
        return false; // a method to return a false condition
    }

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;

        // Mutated code: Unreachable while loop
        while (getCondition()) {
            // This loop is unreachable as the condition is always false
        }

        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
    }
}