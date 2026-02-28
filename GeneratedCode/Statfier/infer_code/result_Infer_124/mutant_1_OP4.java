// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void exampleMethod() {
        // Original code logic
        System.out.println("This is the original code.");

        // Introduced mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is the reachable if block.");
        } else {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is the unreachable else block.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }
}