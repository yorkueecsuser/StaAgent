class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // Unreachable if statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            return "Unreachable";
        }

        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    }

    public static boolean getUnreachableCondition() {
        // This method always returns false to make the unreachable condition unreachable
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}