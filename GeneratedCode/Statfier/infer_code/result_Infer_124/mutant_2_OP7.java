// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void someMethod() {
        // Original code logic can be here
        System.out.println("Original code execution");

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
            System.out.println("This is an unreachable loop");
        }

        // More original code logic can be here
        System.out.println("Continuing with original code");
    }

    private boolean getCondition() {
        // This method will always return false, making the while loop unreachable
        return false;
    }
}