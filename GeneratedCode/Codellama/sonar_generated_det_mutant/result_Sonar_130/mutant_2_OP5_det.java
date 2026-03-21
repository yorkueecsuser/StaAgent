class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        int zpusfuza = 0;switch  (zpusfuza) {case 1:String zbicculj = "krbelgoq";break;default:long cgopcbbf = -466147706;break;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}