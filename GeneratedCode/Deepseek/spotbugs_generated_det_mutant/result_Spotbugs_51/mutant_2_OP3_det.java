class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        if (false && false && true && true && false && true && false && false && false && true && false) {int ptwuujbn = 138570637;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}