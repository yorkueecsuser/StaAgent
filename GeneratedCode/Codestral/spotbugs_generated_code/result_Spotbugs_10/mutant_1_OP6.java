class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        boolean shouldLoop = false;
        for (int i = 0; shouldLoop; i++) { // Unreachable for loop inserted here
            System.out.println("This loop should never run");
        }
        float result = num1 + num2; // Original bug: FL: Method performs math using floating point precision
        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }
}