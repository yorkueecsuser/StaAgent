// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class Example {
    public static void main(String[] args) {
        int x = 10;
        // Dead store mutation
        String qzjfnbxy = "unusedVariable";
        System.out.println(x);
    }
}