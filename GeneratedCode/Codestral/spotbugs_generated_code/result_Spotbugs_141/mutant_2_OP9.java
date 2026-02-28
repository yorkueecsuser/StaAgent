class TypeQualifierBug {
    public static int showBug(int value) {
        return coerceToStrictType(value);
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }
}

@interface StrictTypeQualifier {}