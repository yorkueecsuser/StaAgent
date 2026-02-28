class TypeQualifierBug {
    public static int showBug(int value) {
        int result;
        do {
            result = coerceToStrictType(value);
            value--;
        } while (value >= 0);
        return result; // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }
}

@interface StrictTypeQualifier {}