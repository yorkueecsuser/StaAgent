class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        if (false && true && true && false && true && true && true && true && true && true && false) {long lbotokkr = -175204382;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}