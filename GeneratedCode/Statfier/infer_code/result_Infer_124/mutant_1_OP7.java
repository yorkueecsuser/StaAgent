// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void someMethod() {
        // Original code logic
        System.out.println("Original code execution");

        // Inserting an unreachable while loop according to the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
            System.out.println("This is an unreachable loop");
        }
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the while loop is unreachable
        return false;
    }
}