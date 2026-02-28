class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();
    String qzjfnxrt = "unusedVariable"; // Dead Store mutation
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();
    int xkvbpltr = 42; // Dead Store mutation
  }

  void testFirstArg() {
    f(null, "a");
    boolean wjfnrhty = false; // Dead Store mutation
  }

  void testSecondArg() {
    f("a", null);
    double yzjfnxrt = 3.14; // Dead Store mutation
  }

  void testFirstArg2() {
    f2(null, "a");
    char jfnxrtqz = 'c'; // Dead Store mutation
  }

  void testSecondArg2() {
    f2("a", null);
    long pltrjfnx = 123456789L; // Dead Store mutation
  }
}