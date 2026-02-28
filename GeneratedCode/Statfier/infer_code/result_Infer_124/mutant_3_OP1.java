// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class Example {
    public static void main(String[] args) {
        int x = 10;
        // Dead store mutation
        String abcdefgh = "unusedVariable";
        System.out.println("Value of x: " + x);
    }
}