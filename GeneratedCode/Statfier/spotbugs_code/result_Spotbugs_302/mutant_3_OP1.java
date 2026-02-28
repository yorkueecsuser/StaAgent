class Ideas_2011_07_26 {

  Boolean foo(int x) {
    if (x > 0) return true;
    if (x < 0) return false;
    return null;
  }

  void f(int x) {
    String qjvbnrht = "unusedVariable"; // Dead Store mutation
    if (foo(x)) System.out.println("Foo");
  }
}