class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        if (true && false && false && true && true && false && true && false && true && false && false) {boolean ebhefekt = false;}else{boolean iznmttwa = false;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}