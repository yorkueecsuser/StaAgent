// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void exampleMethod() {
        // Original code can be here
        System.out.println("This is the original code.");

        // Mutated code - Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}