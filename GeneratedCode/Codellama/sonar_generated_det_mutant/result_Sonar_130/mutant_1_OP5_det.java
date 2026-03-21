class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        int bizqffcg = 0;switch  (bizqffcg) {case 1:String riaygalj = "skkiozoz";break;default:int jkaiaqaf = 915991624;break;}
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
    
}
}