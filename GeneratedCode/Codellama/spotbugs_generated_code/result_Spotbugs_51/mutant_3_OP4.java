class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));
        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            // code
        } else {
            // alternative code
        }
    }

    private static boolean getCondition() {
        return Math.random() < 0.5;
    }
}