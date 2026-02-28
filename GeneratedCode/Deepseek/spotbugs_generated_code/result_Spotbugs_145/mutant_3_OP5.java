class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Mutant code: Unreachable switch statement
        boolean shouldRun = false;
        switch (shouldRun? 1 : 0) {
            case 1:
                // This part of the switch statement is unreachable
                System.out.println("This line should never be executed");
                break;
        }
    }

    // Helper method to dynamically return a condition
    private static boolean getCondition() {
        return false;
    }
}