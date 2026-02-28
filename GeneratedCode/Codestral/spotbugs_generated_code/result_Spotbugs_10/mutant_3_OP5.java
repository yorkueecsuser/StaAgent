class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)

        // Mutant: Adding an unreachable switch statement
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code executed!");
                    break;
                default:
                    // This code is also unreachable
                    System.out.println("Default case executed!");
                    break;
            }
        }

        return result;
    }

    // A helper method that will always return a value that makes the switch statement unreachable
    private int getValue() {
        return 2;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }
}