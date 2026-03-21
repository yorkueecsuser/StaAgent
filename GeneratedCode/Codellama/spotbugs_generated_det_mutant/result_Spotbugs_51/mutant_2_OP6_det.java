class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        for  (int lmzpiyhx = 0; lmzpiyhx < 0; lmzpiyhx++) {char ibrjclkq = 'c';}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}