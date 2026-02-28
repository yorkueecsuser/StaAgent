class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop is unreachable as unreachableCondition is always false
            System.out.println("This line will never be executed.");
        }
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }
}