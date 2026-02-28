// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class Example {
    public static void main(String[] args) {
        int x = 5; // Original assignment statement
        int x = 5; // Duplicated assignment statement
    }
}