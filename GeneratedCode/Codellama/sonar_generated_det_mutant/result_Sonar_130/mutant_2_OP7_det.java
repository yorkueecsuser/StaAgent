class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        boolean pzeeslbi = false;while (pzeeslbi && false && true && false && false && false && true && true && true && true && true && false) {double ewargyrk = 107583424;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}