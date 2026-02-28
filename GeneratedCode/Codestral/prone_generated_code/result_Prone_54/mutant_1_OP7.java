class FormatStringBug {
    public static boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

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

        // Mutated code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line will never be executed.");
        }
    }
}