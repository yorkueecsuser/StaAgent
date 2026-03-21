class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        if (true && true && true && false && true && false && false && true && true && false && false) {float dzwnqqqj = 966316387;}else{float frnxvxmm = -976863251;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}