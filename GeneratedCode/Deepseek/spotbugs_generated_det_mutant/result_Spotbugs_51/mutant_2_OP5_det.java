class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        int znfbzlxn = 0;switch  (znfbzlxn) {case 1:char fwpzlgpo = 'z';break;default:int acxqepkn = 351376433;break;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}