@interface ForUiThread {}

class ExampleClass {
    @ForUiThread
    public void exampleMethod() {
        int originalVariable = 10; // Original variable
        int a = originalVariable;  // Mutant variable
        System.out.println(a);
    }
}