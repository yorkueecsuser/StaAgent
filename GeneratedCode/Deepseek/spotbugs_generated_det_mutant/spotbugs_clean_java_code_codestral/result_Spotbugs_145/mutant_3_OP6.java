class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        // Mutation: Adding an unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop will never execute because the condition is always false
        }
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }

    // Helper method to mimic a dynamic condition
    private static boolean getCondition() {
        return false;
    }
}