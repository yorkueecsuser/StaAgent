class StringIndexOutOfBoundsBug {
    public static boolean getFalse() {
        return false;
    }

    public static String showBug(String input, int index) {
        if (getFalse()) {
            // unreachable code
            System.out.println("This is an unreachable statement");
        }

        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}