class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        if (true && false && true && true && false && true && true && false && false && false && false) {int ghpykjww = -1579590;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}