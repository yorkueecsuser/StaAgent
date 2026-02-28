class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        if (falseCondition()) { // Mutant: Unreachable if statement
            System.out.println("This branch is unreachable");
        }

        float result = num1 + num2; // Original bug remains
        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }

    private boolean falseCondition() {
        return false;
    }
}