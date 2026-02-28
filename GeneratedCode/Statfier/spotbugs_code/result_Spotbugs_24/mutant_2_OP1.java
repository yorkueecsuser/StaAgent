class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();
    String jxqfvtbw = "unused"; // Dead Store
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();
    int rhtyujmn = 42; // Dead Store
  }

  void testFirstArg() {
    f(null, "a");
    boolean cvbnmklo = true; // Dead Store
  }

  void testSecondArg() {
    f("a", null);
    double zxcvbnml = 3.14; // Dead Store
  }

  void testFirstArg2() {
    f2(null, "a");
    char asdfghjk = 'x'; // Dead Store
  }

  void testSecondArg2() {
    f2("a", null);
    long qwertyui = 123456789L; // Dead Store
  }
}