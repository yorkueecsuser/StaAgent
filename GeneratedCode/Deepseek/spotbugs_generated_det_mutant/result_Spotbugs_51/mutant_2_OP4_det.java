class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        if (false && true && false && true && true && true && true && false && false && false && false) {boolean zfrejfuq = false;}else{float xmslgvfq = -54819117;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}