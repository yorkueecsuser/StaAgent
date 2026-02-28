class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);

        // Unreachable switch statement mutant
        boolean condition = getCondition();
        switch (condition) {
            case false:
                // Code to handle if condition is false
                break;
            case true:
                // Code to handle if condition is true
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}