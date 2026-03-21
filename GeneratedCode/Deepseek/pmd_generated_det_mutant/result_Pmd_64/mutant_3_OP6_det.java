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
for  (int rlhzajjb = 0; rlhzajjb < 0; rlhzajjb++) {boolean qopfzuxf = false;}

      return "This is a Foo object";
    
}

    public void showBug() {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        System.out.println(foo1.equals(foo2)); // Should print false, but prints true due to missing hashCode() implementation
        System.out.println(foo1.hashCode() == foo2.hashCode()); // Should print false, but prints true due to missing equals() implementation
    }
}