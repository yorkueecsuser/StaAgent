// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void exampleMethod() {
        // Original code
        System.out.println("This is the original code.");

        // Inserted unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }
}