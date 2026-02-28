class TypeQualifierBug {
    public static int showBug(int value) {
        return coerceToStrictType(value);
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        // Unreachable for loop mutation
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }
        return value;
    }
}

@interface StrictTypeQualifier {}