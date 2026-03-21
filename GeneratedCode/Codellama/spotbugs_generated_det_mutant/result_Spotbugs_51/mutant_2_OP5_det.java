class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int mhqeiqud = 0;switch  (mhqeiqud) {case 1:char rujcgudb = 'h';break;default:short jiulybpo = 7386;break;}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}