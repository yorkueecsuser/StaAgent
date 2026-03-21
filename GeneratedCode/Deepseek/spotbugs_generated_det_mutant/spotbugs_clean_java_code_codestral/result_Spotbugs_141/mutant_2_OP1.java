import java.util.Random;

class TypeQualifierBug {
    // This method demonstrates the bug where a value is used without a type qualifier
    // when a value is required to have that qualifier.
    public static int showBug(int value) {
        int deadStoreVar = coerceToStrictType(value); // Adding a dead store mutation
        return coerceToStrictType(value); // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    }

    // This is an identity function where the return value is annotated with a strict type qualifier.
    // This is the only way to turn a non-annotated value into a value with a strict type qualifier annotation.
    private static @StrictTypeQualifier int coerceToStrictType(int value) {
        return value;
    }

    // This function generates a random string of 8 characters for the dead store variable name
    private static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}

// This annotation is just a placeholder for the demonstration of the bug.
// In a real-world scenario, this annotation would be defined by the type qualifier system.
@interface StrictTypeQualifier {}