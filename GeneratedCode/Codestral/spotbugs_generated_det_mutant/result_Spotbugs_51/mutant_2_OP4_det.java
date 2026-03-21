class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        if (false && true && true && true && true && false && true && false && false && false && false) {short rmvrwkzg = -8315;}else{float cqrvmafe = -85078176;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}