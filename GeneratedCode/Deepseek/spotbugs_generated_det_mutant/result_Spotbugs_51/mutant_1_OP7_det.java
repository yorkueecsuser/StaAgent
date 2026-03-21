class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        boolean iyziboqa = false;while (iyziboqa && true && true && true && false && false && false && true && true && false && false && false) {long knidligc = -794133386;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}