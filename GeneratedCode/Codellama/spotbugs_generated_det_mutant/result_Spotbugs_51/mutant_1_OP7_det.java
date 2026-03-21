class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean mjsascck = false;while (mjsascck && false && false && true && true && false && false && true && false && false && true && false) {char gbzqwvmq = 'p';}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}