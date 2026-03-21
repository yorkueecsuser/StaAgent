class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        boolean dqqhcgsb = false;while (dqqhcgsb && true && true && true && true && true && true && true && true && false && true && false) {float gzsbyehp = 173112649;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}