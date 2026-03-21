class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj;

        // Added mutation: unreachable if statement
        if (isUnreachableCondition()) {
            System.out.println("This line is unreachable");
        }

        int length = str.length(); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        System.out.println("Length of the string: " + length);
    }

    // Helper method to return an unreachable condition
    private static boolean isUnreachableCondition() {
        return false;
    }
}