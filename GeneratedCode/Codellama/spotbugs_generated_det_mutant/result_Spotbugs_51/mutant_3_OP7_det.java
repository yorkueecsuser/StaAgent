class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean rfkcisnd = false;while (rfkcisnd && false && true && false && true && false && false && true && true && true && false && false) {char quszgjvt = 't';}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}