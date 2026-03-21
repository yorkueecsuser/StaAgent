class TypeQualifierBug {
    public static int showBug(int value) {
        return coerceToStrictType(value);
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        // Added mutant: unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable because getCondition() always returns false
        } else {
            // This is the actual code that will be executed
        }
        return value;
    }

    // This method is used to simulate a condition that always returns false
    private static boolean getCondition() {
        return false;
    }
}

@interface StrictTypeQualifier {}