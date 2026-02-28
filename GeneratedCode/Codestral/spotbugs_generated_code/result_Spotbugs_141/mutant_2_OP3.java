class TypeQualifierBug {
    public static int showBug(int value) {
        boolean unreachableCondition = getCondition();
        if(unreachableCondition) {
            throw new RuntimeException("Unreachable code executed");
        }
        return coerceToStrictType(value);
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }

    private static boolean getCondition() {
        return false;
    }
}