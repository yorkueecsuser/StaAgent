class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();
    String abcdexyz = "unused"; // Dead store mutation
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();
    int pqrsabcd = 42; // Dead store mutation
  }

  void testFirstArg() {
    f(null, "a");
    double wvutrqpo = 3.14; // Dead store mutation
  }

  void testSecondArg() {
    f("a", null);
    boolean mnopqrst = true; // Dead store mutation
  }

  void testFirstArg2() {
    f2(null, "a");
    char yxwvutsr = 'x'; // Dead store mutation
  }

  void testSecondArg2() {
    f2("a", null);
    long hgfedcba = 123456789L; // Dead store mutation
  }
}