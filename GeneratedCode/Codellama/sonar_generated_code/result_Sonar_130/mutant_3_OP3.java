class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);

        // Insert unreachable if branch
        if (false) {
            // This code is unreachable
            System.out.println("This is unreachable code");
        }
    }
}