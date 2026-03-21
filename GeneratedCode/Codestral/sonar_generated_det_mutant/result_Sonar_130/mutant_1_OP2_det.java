class FloatMathBug {
public float showBug() {
    float a = 16777216.0f;
    float b = 1.0f;
    b = 1.0f;
    float c = a + b;
    return c;
}

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        float result = bugDemo.showBug();
        System.out.println("The buggy result is: " + result);
    }
}