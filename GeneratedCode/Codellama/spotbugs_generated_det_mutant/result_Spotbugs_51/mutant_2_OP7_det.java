class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean wkaebdzz = false;while (wkaebdzz && true && true && false && true && true && true && true && true && true && false && false) {boolean xwyzoshf = false;}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}