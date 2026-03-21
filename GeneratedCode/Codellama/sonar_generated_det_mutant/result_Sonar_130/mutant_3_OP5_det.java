class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        int iltfruln = 0;switch  (iltfruln) {case 1:double bqqpdcxz = -105909818;break;default:char etbuhbmu = 'p';break;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}