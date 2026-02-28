class TypeQualifierBug {
    public static int showBug(int value) {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This is an unreachable loop");
        }
        return coerceToStrictType(value); // Bug: TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}

@interface StrictTypeQualifier {}