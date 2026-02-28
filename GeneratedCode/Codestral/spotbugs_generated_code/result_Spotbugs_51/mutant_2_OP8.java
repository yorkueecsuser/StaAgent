class StringIndexOutOfBoundsBug {
    public static String showBug(String str, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return str.charAt(index) + "";
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}