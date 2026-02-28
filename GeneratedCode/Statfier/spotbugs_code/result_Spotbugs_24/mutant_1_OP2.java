class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    k.hashCode(); // Duplicated method call
    if (v == null) throw new NullPointerException();
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();
    k.hashCode(); // Duplicated method call
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
}