class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));

        // Unreachable while loop mutant
        boolean condition = getCondition();
        while (condition) {
            // Do nothing
        }
    }

    private static boolean getCondition() {
        return false;
    }
}