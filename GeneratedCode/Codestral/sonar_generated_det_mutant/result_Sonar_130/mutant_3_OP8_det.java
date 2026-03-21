class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        float fnfratvm = bugDemo.showBug();
        System.out.println("The buggy fnfratvm is: " + fnfratvm);
    }
}