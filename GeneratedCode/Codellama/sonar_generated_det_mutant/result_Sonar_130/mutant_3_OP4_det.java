class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        if (false && false && true && false && false && false && false && false && false && true && false) {byte tkbzwfbp = -16;}else{float bnuxltgr = -553105626;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}