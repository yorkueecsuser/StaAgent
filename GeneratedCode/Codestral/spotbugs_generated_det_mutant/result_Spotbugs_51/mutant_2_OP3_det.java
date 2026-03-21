class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        if (true && true && false && true && true && true && false && true && false && false && false) {int bnjlsouf = -563137914;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}