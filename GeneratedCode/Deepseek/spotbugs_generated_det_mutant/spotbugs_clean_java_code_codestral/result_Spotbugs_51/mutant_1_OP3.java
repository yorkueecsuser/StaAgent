class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable if statement
            return "Unreachable code";
        }
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}