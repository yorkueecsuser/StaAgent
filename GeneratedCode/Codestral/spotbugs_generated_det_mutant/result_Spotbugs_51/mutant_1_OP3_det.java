class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        if (true && false && false && true && true && false && true && false && false && true && false) {float ehhvdwmi = 574377925;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}