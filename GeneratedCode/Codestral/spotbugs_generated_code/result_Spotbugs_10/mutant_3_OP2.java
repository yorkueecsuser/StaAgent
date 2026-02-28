class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // Original buggy line
        float duplicatedResult = num1 + num2; // Duplicated buggy line
        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }
}