class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int zkyzpwmb = 0;switch  (zkyzpwmb) {case 1:float sfscbtjt = 588917400;break;default:float ezunqwuk = -41780492;break;}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}