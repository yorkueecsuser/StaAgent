@interface ForNonUiThread {
    // Dummy method to introduce a variable for mutation
    default void dummyMethod() {
        String originalName = "example";
        System.out.println(originalName);

        // Mutated variable
        String a = "example";
        System.out.println(a);
    }
}