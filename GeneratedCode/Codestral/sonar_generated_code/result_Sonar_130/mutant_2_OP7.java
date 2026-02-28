class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        boolean conditionWhile = getCondition();
        // Mutant: Unreachable while loop
        while (conditionWhile) {
            // This loop will never be executed
        }
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
        // The result will be 1.6777216E7 instead of 1.6777217E7
    }
}