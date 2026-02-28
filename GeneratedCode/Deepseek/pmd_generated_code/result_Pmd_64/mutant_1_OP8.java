class Foo {        // perfect, both methods provided
    public boolean equals(Object other) {
      // do some comparison
      return (this == other);
    }
    
    public int hashCode() {
      // return some hash value
      return 42;
    }
    
    // Mutated section
    public String toString() {
      return "This is a Foo object";
    }

    public void showBug() {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        System.out.println(foo1.equals(foo2)); // Should print false, but prints true due to missing hashCode() implementation
        System.out.println(foo1.hashCode() == foo2.hashCode()); // Should print false, but prints true due to missing equals() implementation
    }
    
    public String toStringRenaming() {
      return "This is a Foo object, but with renamed method";
    }

    public void showBugRenaming() {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        System.out.println(foo1.equals(foo2)); // Should print true, due to renamed equals() method
        System.out.println(foo1.hashCode() == foo2.hashCode()); // Should print true, due to renamed hashCode() method
    }
}