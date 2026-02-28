class TypeQualifierBug {
    // This method demonstrates the bug where a value is used without a type qualifier
    // when a value is required to have that qualifier.
    public static int showBug(int value) {
        boolean condition = unreachableCondition(); // Inserted unreachable condition
        if (condition) {
            return coerceToStrictType(value); // This line will not be executed
        }
        return coerceToStrictType(value); // Original bug line, still exists
    }

    // This is an identity function where the return value is annotated with a strict type qualifier.
    // This is the only way to turn a non-annotated value into a value with a strict type qualifier annotation.
    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }

    // This method always returns false, making the if statement unreachable
    private static boolean unreachableCondition() {
        return false;
    }
}

// This annotation is just a placeholder for the demonstration of the bug.
// In a real-world scenario, this annotation would be defined by the type qualifier system.
@interface StrictTypeQualifier {}