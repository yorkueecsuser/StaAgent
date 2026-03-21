class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        if (false && false && false && true && false && false && false && true && true && false && false) {char liatqxru = 'x';}else{String gmpytzsc = "zlwltsni";}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}