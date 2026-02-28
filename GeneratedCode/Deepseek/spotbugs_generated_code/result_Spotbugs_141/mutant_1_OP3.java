class TypeQualifierBug {
    // This method demonstrates the bug where a value is used without a type qualifier
    // when a value is required to have that qualifier.
    public static int showBug(int value) {
        return coerceToStrictType(value); // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    }

    // This is an identity function where the return value is annotated with a strict type qualifier.
    // This is the only way to turn a non-annotated value into a value with a strict type qualifier annotation.
    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("This line is unreachable!");
        }
        return value;
    }

    // This method is used to simulate a dynamically determined condition
    private static boolean getUnreachableCondition() {
        return false;
    }
}