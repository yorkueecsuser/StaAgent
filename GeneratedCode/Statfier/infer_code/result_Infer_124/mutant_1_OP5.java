// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public void someMethod() {
        // Original code logic
        System.out.println("This is the original method logic.");

        // Introduced unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                System.out.println("This is an unreachable case.");
                break;
            default:
                System.out.println("This is also unreachable.");
                break;
        }
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}