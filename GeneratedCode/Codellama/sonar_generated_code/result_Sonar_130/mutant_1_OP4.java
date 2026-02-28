class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);

        boolean shouldRun = getCondition();
        if (shouldRun) {
            float d = a + b; // Mutant code: unreachable if-else statement
            System.out.println(d);
        } else {
            float e = a - b; // Mutant code: unreachable if-else statement
            System.out.println(e);
        }
    }

    private static boolean getCondition() {
        return Math.random() > 0.5;
    }
}