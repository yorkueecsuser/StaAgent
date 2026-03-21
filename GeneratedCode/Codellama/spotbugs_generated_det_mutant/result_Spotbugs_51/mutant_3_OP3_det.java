class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && true && true && true && true && false && true && true && false && false && false) {float pxqkibvg = 123435914;}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}