class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));

        // Unreachable switch statement mutant
        boolean condition = getCondition();
        switch (condition) {
            case 1:
                // code
                break;
            default:
                break;
        }
    }

    // Method to get condition value
    public static boolean getCondition() {
        return false;
    }
}