class FormatStringBug {
    private static boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void showBug() {
        // Unreachable for loop mutant
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable code block");
        }

        // Rest of the original code...

        // Bug: Duplicate flags are provided in the format specifier
        System.out.println(String.format("e = %++10.4f", Math.E)); // BUG: FormatString

        // Rest of the original code...
    }
}