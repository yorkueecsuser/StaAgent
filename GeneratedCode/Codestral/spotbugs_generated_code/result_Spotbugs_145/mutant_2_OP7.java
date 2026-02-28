class TypeQualifierBug {
    public static void showBug(Object obj) {
        boolean unreachableCondition = getUnreachableCondition();

        while (unreachableCondition) {
            // This loop is unreachable, as the condition is always false
            System.out.println("This line will never be executed!");
        }

        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }

    private static boolean getUnreachableCondition() {
        return false; // This method always returns false
    }
}