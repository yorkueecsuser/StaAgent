class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // Original bug remains intact
        boolean unreachableCondition = false;

        if (unreachableCondition) {
            // Unreachable if-else statement
            return "Unreachable code";
        } else {
            return input.charAt(index) + ""; // Bug: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        }
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}