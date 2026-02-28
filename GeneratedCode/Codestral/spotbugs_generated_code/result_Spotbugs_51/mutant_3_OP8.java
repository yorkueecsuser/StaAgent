class StringIndexOutOfBoundsBug {
    public static String showBug(String inputStr, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return inputStr.charAt(index) + "";
    }

    public static void main(String[] args) {
        String testStr = "Hello";
        System.out.println(showBug(testStr, 5));
    }
}