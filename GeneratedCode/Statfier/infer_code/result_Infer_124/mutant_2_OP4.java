// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void exampleMethod() {
        // Original code
        System.out.println("This is the original code.");

        // Mutated code - Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is the reachable if block.");
        } else {
            // This is the unreachable else block
            System.out.println("This is the unreachable else block.");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that will always be true
        return true;
    }
}