class FloatMathBug {
    private int getUnreachableValue() {
        // This method will always return 0, making the switch statement unreachable
        return 0;
    }

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;

        // Unreachable switch statement
        switch (getUnreachableValue()) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
        }

        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
        // The result will be 1.6777216E7 instead of 1.6777217E7
    }
}