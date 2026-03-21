class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int bowbnaqf = 0;switch  (bowbnaqf) {case 1:boolean ngnqtjwh = true;break;default:double kqavqxkb = 666209109;break;}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}