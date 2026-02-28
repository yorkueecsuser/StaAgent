// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void exampleMethod() {
        // Original code logic can be here
        System.out.println("Original code execution");

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will return false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the for loop unreachable
        return false;
    }
}