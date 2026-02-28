class FormatStringBug {
    public static void showBug() {
        // Original code
        System.out.println(String.format("e = %++10.4f", Math.E));
        System.out.println(String.format("%#b", Math.E));
        System.out.println(String.format("%c", 0x110000));
        System.out.println(String.format("%f", "abcd"));
        System.out.println(String.format("%-010d", 5));
        System.out.println(String.format("%.c", 'c'));
        System.out.println(String.format("%1n", System.lineSeparator()));
        System.out.println(String.format("%<s", "test"));
        System.out.println(String.format("e = %-f", Math.E));
        System.out.println(String.format("%r", "hello"));

        // Mutant code - Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable for loop executed!");
        }
    }

    // Method to return the condition for the for loop
    private static boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }
}