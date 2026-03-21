class TypeQualifierBug {
    public static int showBug(int value) {
        return coerceToStrictType(value);
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        boolean unreachableCondition = false;
        switch(unreachableCondition) {
            case true:
                // This block will never execute due to unreachableCondition being false
                System.out.println("This is an unreachable block.");
                break;
        }
        return value;
    }
}

@interface StrictTypeQualifier {}