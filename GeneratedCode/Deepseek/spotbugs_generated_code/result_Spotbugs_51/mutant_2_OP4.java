class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // Original bug
        return input.charAt(index) + "";
    }

    // Mutated code: Inserting unreachable if-else statement
    public static void unreachableMethod(String input) {
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This code will never run");
        } else {
            // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
            // Intentionally keeping the original bug for mutation analysis
            System.out.println(showBug(input, input.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
        unreachableMethod("World"); // To trigger the unreachable if-else statement
    }
}