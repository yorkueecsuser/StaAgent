class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);

        // Added unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            // Do nothing
        }
    }

    private static boolean getCondition() {
        // This method is used to generate a non-final variable for the unreachable while loop condition
        return false;
    }
}