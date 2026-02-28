class TypeQualifierBug {
    private static boolean getCondition() {
        return false;
    }

    public static void showBug(Object obj) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be reached");
        }

        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }
}