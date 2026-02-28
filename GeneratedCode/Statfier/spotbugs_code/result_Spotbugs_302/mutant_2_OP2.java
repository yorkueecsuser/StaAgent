class Ideas_2011_07_26 {

  Boolean foo(int x) {
    if (x > 0) {
      return true;
      if (x > 0) return true; // Duplicate condition
    }
    if (x < 0) {
      return false;
      if (x < 0) return false; // Duplicate condition
    }
    return null;
  }

  void f(int x) {
    if (foo(x)) {
      System.out.println("Foo");
      if (foo(x)) System.out.println("Foo"); // Duplicate condition
    }
  }
}