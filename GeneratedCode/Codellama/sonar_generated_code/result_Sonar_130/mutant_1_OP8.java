class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    }

    // Renaming user-defined variables declared in a program.
    public static void main(String[] args) {
        float k = 16777216.0f;
        float l = 1.0f;
        float m = k + l; // BUG: Math should not be performed on floats
        System.out.println(m);
    }
}