class FormatStringBug {
    public static void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop should never execute
        }

        // Rest of the original code
        //...
    }

    private static boolean getCondition() {
        return false;
    }
}