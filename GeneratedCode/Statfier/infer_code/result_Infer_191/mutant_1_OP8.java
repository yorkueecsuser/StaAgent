@interface ForNonUiThread {
    // Hypothetical method to demonstrate renaming mutation
    default void exampleMethod() {
        int a = 10; // Original variable
        int b = a + 5; // Using the original variable

        // Mutant: Renaming variable 'a' to 'c'
        int c = 10; // Mutated variable
        int d = c + 5; // Using the mutated variable
    }
}