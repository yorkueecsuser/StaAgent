class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();
  }

  void f2(Object k, Object v) {

    if (v == null) throw new NullPointerException();
    k.hashCode();
  }

  void testFirstArg() {
    f(null, "a");
  }

  void testSecondArg() {
    f("a", null);
  }

  void testFirstArg2() {
    f2(null, "a");
  }

  void testSecondArg2() {
    f2("a", null);
  }

  // Mutated code
  void g(Object x, Object y) {
    x.hashCode();
    if (y == null) throw new NullPointerException();
  }

  void g2(Object x, Object y) {

    if (y == null) throw new NullPointerException();
    x.hashCode();
  }

  void testFirstArg3() {
    g(null, "b");
  }

  void testSecondArg3() {
    g("b", null);
  }

  void testFirstArg4() {
    g2(null, "b");
  }

  void testSecondArg4() {
    g2("b", null);
  }
}