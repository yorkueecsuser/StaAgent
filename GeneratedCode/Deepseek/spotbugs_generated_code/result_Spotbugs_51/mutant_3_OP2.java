class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        String result = input.charAt(index) + "";
        // Mutation: Duplication
        String duplicateResult = input.charAt(index) + "";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}