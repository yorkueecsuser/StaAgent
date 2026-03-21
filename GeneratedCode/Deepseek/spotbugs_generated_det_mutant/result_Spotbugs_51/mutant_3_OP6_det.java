class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        for  (int rigpozsm = 0; rigpozsm < 0; rigpozsm++) {boolean jxbhqmwr = false;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}