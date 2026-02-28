class FloatingPointPrecisionBug {
    private boolean getUnreachableCondition() {
        return false; // Always return false to make the if statement unreachable
    }

    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)

        if (getUnreachableCondition()) {
            // This block is unreachable due to the condition being always false
            System.out.println("This line should never be executed.");
        }

        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }
}