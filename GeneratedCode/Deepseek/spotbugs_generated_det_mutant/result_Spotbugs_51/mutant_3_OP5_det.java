class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        int stwxknin = 0;switch  (stwxknin) {case 1:byte haanrxyl = -67;break;default:char aiiojgrz = 'g';break;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}