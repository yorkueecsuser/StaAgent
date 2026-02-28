class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        boolean condition = getCondition();  // Added dynamically determined condition
        for (int i = 0; condition; i++) {    // Inserted unreachable for loop
            System.out.println("Unreachable loop");
        }
        // Original bug-containing line
        return input.charAt(index) + "";
    }

    public static boolean getCondition() {
        return false;   // Method always returns false to make loop unreachable
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}