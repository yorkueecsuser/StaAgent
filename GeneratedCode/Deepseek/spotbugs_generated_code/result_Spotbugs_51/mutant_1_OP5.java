class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is an unreachable case.");
                break;
            default:
                break;
        }
        return input.charAt(index) + "";
    }

    private static int getUnreachableValue() {
        // This method will always return a value that is not 1,
        // making the switch statement unreachable.
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}