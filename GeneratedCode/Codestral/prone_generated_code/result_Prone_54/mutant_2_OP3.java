class FormatStringBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug() {
        // Mutant code for Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This is an unreachable branch.");
        }

        // Bug: Duplicate flags are provided in the format specifier
        System.out.println(String.format("e = %++10.4f", Math.E));

        // Other bugs...
    }
}