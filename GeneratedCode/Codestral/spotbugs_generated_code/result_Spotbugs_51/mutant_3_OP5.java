class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // Adding unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This code will never execute.");
                break;
        }
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    }

    private static int getValue() {
        // Always return a value that is not 1 to ensure the switch statement is unreachable
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}