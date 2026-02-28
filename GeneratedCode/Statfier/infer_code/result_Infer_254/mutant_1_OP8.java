@interface ForUiThread {
    // Original code remains intact

    // Introduced a dummy method to demonstrate renaming mutation
    default void dummyMethod() {
        String originalVariable = "This is a test";
        System.out.println(originalVariable);

        // Mutated code with renamed variable
        String a = "This is a test";
        System.out.println(a);
    }
}