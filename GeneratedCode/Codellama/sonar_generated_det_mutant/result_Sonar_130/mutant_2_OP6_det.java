class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        for  (int aaqhatgm = 0; aaqhatgm < 0; aaqhatgm++) {short xcrposip = 8231;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}