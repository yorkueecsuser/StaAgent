public interface JsonType {
    // Hypothetical method with a variable to demonstrate renaming mutation
    default void hypotheticalMethod() {
        String originalVariable = "example";
        System.out.println(originalVariable);
        
        // Mutated version of the method with the variable renamed
        String b = "example";
        System.out.println(b);
    }
}