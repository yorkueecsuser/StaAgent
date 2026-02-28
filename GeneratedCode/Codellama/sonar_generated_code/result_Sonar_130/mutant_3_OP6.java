class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // This loop body is unreachable and will never be executed
            System.out.println("This is an unreachable statement");
        }
    }
}