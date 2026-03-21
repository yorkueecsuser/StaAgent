class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && true && true && false && true && false && true && false && true && true && false) {String orpetill = "fbmyigut";}else{char zdctltot = 'i';}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}