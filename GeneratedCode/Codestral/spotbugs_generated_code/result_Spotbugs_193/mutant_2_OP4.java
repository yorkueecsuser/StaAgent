import java.lang.reflect.Field;

class ReflectionBug {

    private static class SecretClass {
        private String secret = "top secret";
    }

    // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD)
    public static void modifyField(Field field, Object obj, String newValue) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, newValue);

        // Added mutant: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never be executed.");
        } else {
            // Add some code here that won't affect the original behavior
            // For example, printing a debug message
            System.out.println("Debug: ModifyField method executed.");
        }
    }

    // Rest of the code...
}