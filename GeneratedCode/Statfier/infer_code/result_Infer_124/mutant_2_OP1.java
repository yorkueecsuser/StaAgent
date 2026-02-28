// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public static void main(String[] args) {
        // Original code
        int x = 10;
        System.out.println(x);

        // Dead store mutation
        String yjfnrhty = "unusedVariable";
    }
}