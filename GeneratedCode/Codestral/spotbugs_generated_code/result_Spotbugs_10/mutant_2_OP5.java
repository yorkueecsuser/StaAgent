class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        int unreachableCondition = 0;
        switch (unreachableCondition) { // Unreachable switch statement
            case 1:
                System.out.println("This code should never be executed.");
                break;
        }
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        return result;
    }

    // Rest of the code remains the same
}