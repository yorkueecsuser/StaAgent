class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // unreachable code
            int i = 10 / 0; // This line will never be executed but is included to avoid a compile error
        }
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}