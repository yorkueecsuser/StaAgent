class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed");
        }

        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    // This is a placeholder method to ensure compilation. Replace with actual method call.
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