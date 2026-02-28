// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class Example {
    public static void main(String[] args) {
        int x = 5; // Original assignment statement
        int x = 5; // Duplicated assignment statement

        String message = "Hello"; // Original assignment statement
        String message = "Hello"; // Duplicated assignment statement

        int y = x + 3; // This line is not duplicated because it involves method invocation (implied + operator)
    }
}