class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        int duplicatedIndex = index;  // Mutant code added
        return input.charAt(duplicatedIndex) + "" + input.charAt(duplicatedIndex);  // Mutant code added
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}