class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));

        // Start of mutated code
        if (false) {
            String unreachableStr = "Unreachable code";
            System.out.println(unreachableStr);
        } else {
            System.out.println(str.substring(index));
        }
        // End of mutated code
    }
}