class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Unreachable if-else statement mutant
        if (isUnreachableCondition()) {
            // This code will never execute
            System.out.println("This is an unreachable if branch");
        } else {
            // This code will always execute
            System.out.println("This is the reachable else branch");
        }

        return c;
    }

    private boolean isUnreachableCondition() {
        // The condition is always false to make the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
        // The result will be 1.6777216E7 instead of 1.6777217E7
    }
}