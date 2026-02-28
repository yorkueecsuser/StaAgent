// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public static void main(String[] args) {
        int originalVariable = 10;
        int a = originalVariable; // Mutated variable name
        System.out.println(a);
    }
}