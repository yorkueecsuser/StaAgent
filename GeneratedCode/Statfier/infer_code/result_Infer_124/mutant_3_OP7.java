// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void someMethod() {
        // Original code logic
        System.out.println("Original code execution");

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}