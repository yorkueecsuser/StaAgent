@interface ForUiThread {
    // Hypothetical method with a user-defined variable
    String value() default "";
}

class ExampleClass {
    // Introducing a hypothetical variable to apply the renaming mutation
    private String originalVariable = "example";

    public void exampleMethod() {
        // Using the hypothetical variable
        System.out.println(originalVariable);
        
        // Mutated version of the variable
        private String b = "example";
        System.out.println(b);
    }
}