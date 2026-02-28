class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable as getCondition() always returns false
            System.out.println("This is an unreachable branch!");
        } else {
            // This is the else branch of the unreachable if-else statement
            // It does not contain any code
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else statement unreachable
        return false;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }
}