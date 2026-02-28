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
  void f_m(Object x, Object v) {
    x.hashCode();
    if (v == null) throw new NullPointerException();
  }

  void f2_m(Object k, Object y) {

    if (y == null) throw new NullPointerException();
    k.hashCode();
  }

  void testFirstArg_m() {
    f_m(null, "a");
  }

  void testSecondArg_m() {
    f_m("a", null);
  }

  void testFirstArg2_m() {
    f2_m(null, "a");
  }

  void testSecondArg2_m() {
    f2_m("a", null);
  }
}