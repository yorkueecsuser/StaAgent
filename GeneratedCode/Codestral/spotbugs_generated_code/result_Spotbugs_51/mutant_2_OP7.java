class StringIndexOutOfBoundsBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static String showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)

        // Mutant code: Unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This code will never be executed.");
        }

        return input.charAt(index) + "";
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}