class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b;

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This code will never execute because getCondition() always returns false
            System.out.println("This is an unreachable code block.");
        } else {
            // Alternative code
            System.out.println("This is the alternative code block.");
        }

        return c;
    }

    // Method that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
    }
}