class FormatStringBug {
    public static void showBug() {
        // Bug: Duplicate flags are provided in the format specifier
        System.out.println(String.format("e = %++10.4f", Math.E)); // BUG: FormatString

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute because getCondition() always returns false
            System.out.println("This is an unreachable loop.");
        }

        // Bug: A conversion and flag are incompatible
        System.out.println(String.format("%#b", Math.E)); // BUG: FormatString

        // Rest of the code...
    }

    // A helper method to return false, making the while loop unreachable
    private static boolean getCondition() {
        return false;
    }
}