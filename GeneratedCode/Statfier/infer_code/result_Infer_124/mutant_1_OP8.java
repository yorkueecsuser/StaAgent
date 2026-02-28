// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class Example {
    public static void main(String[] args) {
        int variable = 10;
        int anotherVariable = 20;

        // Original code logic
        if (variable > anotherVariable) {
            System.out.println("variable is greater");
        } else {
            System.out.println("anotherVariable is greater or equal");
        }

        // Mutated code with renamed variable
        int a = 10;
        int b = 20;

        // Mutated code logic
        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater or equal");
        }
    }
}