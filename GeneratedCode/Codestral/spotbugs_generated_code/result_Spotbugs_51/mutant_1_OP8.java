class StringIndexOutOfBoundsBug {
    public static String showBug(String inputStr, int indexVal) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return inputStr.charAt(indexVal) + "";
    }

    public static void main(String[] args) {
        // Renaming Mutation Operator: Renamed 'args' to'mainArgs'
        String[] mainArgs = args;
        System.out.println(showBug("Hello", 5));
    }
}