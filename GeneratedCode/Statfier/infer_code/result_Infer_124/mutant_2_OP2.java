// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class Example {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        x = y; // Original assignment statement
        x = y; // Duplicated assignment statement
        System.out.println(x);
    }
}