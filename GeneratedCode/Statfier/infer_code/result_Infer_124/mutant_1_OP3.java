// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void exampleMethod() {
        // Original code
        System.out.println("This is the original code.");

        // Inserted unreachable if statement mutant
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable if statement.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if block is unreachable
        return false;
    }
}