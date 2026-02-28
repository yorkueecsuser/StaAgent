class FloatingPointPrecisionMutant {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2;
        return result;
    }

    public void showBug() {
        double num1 = 16777216.0; // Mutant: Using double instead of float
        double num2 = 1.0; // Mutant: Using double instead of float
        double result = demonstrateBug(num1, num2); // Mutant: Using double result
        System.out.println("Result: " + result);
    }
}