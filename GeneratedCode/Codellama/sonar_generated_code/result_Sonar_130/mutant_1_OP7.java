class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
        
        // Unreachable while loop
        while (false) {
            System.out.println("This message should never be printed!");
        }
    }
}