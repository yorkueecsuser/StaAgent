class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch is unreachable");
        } else {
            // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
            return input.charAt(index) + "";
        }
    }

    // Dummy method to avoid compile error
    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}