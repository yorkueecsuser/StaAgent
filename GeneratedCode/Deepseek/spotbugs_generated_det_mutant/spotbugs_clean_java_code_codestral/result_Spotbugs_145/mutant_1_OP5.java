class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)

        // New unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be reached.");
                break;
        }

        int length = str.length();
        System.out.println("Length of the string: " + length);
    }

    private static int getUnreachableValue() {
        return -1; // Always returns a value that isn't 1
    }
}