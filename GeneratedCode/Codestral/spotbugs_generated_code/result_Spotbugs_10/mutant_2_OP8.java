class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float r = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        return r;
    }

    public void showBug() {
        float n1 = 16777216.0f; // Mutated variable according to Renaming operator
        float n2 = 1.0f;
        float res = demonstrateBug(n1, n2); // Mutated variable according to Renaming operator
        System.out.println("Result: " + res); // Mutated variable according to Renaming operator
    }
}