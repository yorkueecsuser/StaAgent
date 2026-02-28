class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // Original bug
        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);

        // Introducing Unreachable switch statement
        boolean shouldNotRun = false;
        int checkValue = (int) result;
        switch(checkValue) {
            case 1:
                System.out.println("This line should never be executed");
                break;
        }

        System.out.println("Result: " + result);
    }

    // A method to ensure'shouldNotRun' is always false
    private boolean getCondition() {
        return false;
    }
}