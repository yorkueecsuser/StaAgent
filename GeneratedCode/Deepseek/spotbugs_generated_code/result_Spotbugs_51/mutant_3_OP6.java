class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable for loop
            System.out.println("This loop is unreachable.");
        }
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}