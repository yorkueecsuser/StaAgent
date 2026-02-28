class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Mutant: Unreachable switch statement
        boolean shouldRun = false;
        int value = getValue();
        if (shouldRun) {
            switch(value) {
                case 1:
                    System.out.println("This line will never be executed");
                    break;
            }
        }

        return c;
    }

    // Method to dynamically determine the switch value
    private int getValue() {
        return 1;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
        // The result will be 1.6777216E7 instead of 1.6777217E7
    }
}