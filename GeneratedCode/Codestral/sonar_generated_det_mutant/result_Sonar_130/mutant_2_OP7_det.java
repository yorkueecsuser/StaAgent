class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        boolean pshllort = false;while (pshllort && true && false && true && false && true && true && false && false && false && false && false) {boolean huzurrll = false;}
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    
}

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        float result = bugDemo.showBug();
        System.out.println("The buggy result is: " + result);
    }
}