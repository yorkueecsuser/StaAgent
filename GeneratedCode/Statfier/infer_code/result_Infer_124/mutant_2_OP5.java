// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public static void main(String[] args) {
        // Original code can be placed here
        System.out.println("Original code execution");

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This will always evaluate to 1, making the switch unreachable
            case 0:
                System.out.println("This will never be printed");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}