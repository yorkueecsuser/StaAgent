class Foo {        // perfect, both methods provided
    public boolean equals(Object other) {
      // do some comparison
      return (this == other);
    }
    
    public int hashCode() {
      // return some hash value
      return 42;
    }
    
    // BUG: OverrideBothEqualsAndHashcode
    public String toString() {
      return "This is a Foo object";
    }

    public void showBug() {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        System.out.println(foo1.equals(foo2)); // Should print false, but prints true due to missing hashCode() implementation
        System.out.println(foo1.hashCode() == foo2.hashCode()); // Should print false, but prints true due to missing equals() implementation

        // Mutation (Unreachable if statement)
        boolean mutationCondition = getMutationCondition(); // This method needs to be implemented and return false
        if (mutationCondition) { // This if statement should be unreachable
            System.out.println("This line should be unreachable");
        }
    }

    // Method to provide false condition for mutation
    private boolean getMutationCondition() {
        return false;
    }
}