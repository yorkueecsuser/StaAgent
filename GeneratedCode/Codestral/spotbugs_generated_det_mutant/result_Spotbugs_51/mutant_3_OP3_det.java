class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        if (false && true && false && true && false && false && true && false && false && true && false) {int dlkexahu = 630451466;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}