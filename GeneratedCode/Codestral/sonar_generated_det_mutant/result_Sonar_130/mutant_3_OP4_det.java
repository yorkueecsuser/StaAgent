class FloatMathBug {
    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        if (false && true && false && true && false && true && true && false && true && true && false) {String aymlzolb = "iczsvgrg";}else{long vkyjxcpw = 237348940;}
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    
}

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        float result = bugDemo.showBug();
        System.out.println("The buggy result is: " + result);
    }
}