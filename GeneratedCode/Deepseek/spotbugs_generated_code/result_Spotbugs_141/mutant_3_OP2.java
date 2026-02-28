class TypeQualifierBug {
    // This method demonstrates the bug where a value is used without a type qualifier
    // when a value is required to have that qualifier.
    public static int showBug(int value) {
        int buggyValue1 = coerceToStrictType(value); // Original buggy line
        int buggyValue2 = coerceToStrictType(value); // Duplicated line
        return buggyValue1; // Returning the original value to maintain the bug
    }

    // This is an identity function where the return value is annotated with a strict type qualifier.
    // This is the only way to turn a non-annotated value into a value with a strict type qualifier annotation.
    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }
}

// This annotation is just a placeholder for the demonstration of the bug.
// In a real-world scenario, this annotation would be defined by the type qualifier system.
@interface StrictTypeQualifier {}