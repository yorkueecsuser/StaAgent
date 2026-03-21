class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (true && true && false && true && false && false && false && true && false && false && false) {byte xagsfres = -116;}else{float xhccoufl = -74945133;}
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
    
}
}