class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b;

        // Mutant code: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // This code will never be executed
                System.out.println("This is an unreachable switch statement.");
                break;
        }

        return c;
    }

    private int getValue() {
        // This method ensures that the switch condition is dynamically determined at runtime
        return 0;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
    }
}