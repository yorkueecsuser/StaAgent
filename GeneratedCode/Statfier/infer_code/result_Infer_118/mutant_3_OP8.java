public interface JsonType {
    // Original code remains unchanged

    // Introduced a dummy method for mutation purposes
    default void dummyMethod() {
        String originalVariable = "dummy";
        System.out.println(originalVariable);
    }

    // Mutated code with the variable renamed
    default void dummyMethodMutant() {
        String a = "dummy";
        System.out.println(a);
    }
}