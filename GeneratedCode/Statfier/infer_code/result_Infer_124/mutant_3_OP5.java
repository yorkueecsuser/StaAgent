// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void exampleMethod() {
        // Original code logic
        System.out.println("This is the original code.");

        // Introduced mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case to avoid unreachable statement error
                System.out.println("This is the default case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, ensuring the switch statement is unreachable
        return false;
    }
}