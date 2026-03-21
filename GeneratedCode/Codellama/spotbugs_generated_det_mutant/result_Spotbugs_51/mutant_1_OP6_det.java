class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        for  (int adpqspjg = 0; adpqspjg < 0; adpqspjg++) {char xjuktvru = 'w';}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}