class TypeQualifierBug {
    // The unreachable switch statement is added here
    private static void unreachableSwitch(int value) {
        boolean condition = false; // This condition is always false, making the switch unreachable
        if (condition) {
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    // This code is also unreachable
                    System.out.println("Default unreachable code");
            }
        }
    }

    public static int showBug(int value) {
        unreachableSwitch(value); // Call the unreachable switch statement
        return coerceToStrictType(value); // Original bug remains unchanged
    }

    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }
}

@interface StrictTypeQualifier {}