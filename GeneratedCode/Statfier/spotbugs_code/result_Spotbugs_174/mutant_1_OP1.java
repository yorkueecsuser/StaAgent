class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    if (x == null) throw new NullPointerException();
    this.x = x;
    String abcdefgh = "unusedVariable"; // Dead Store
  }

  void pleaseGiveMeNonnull2(Object x) {
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;
    int ijklmnop = 42; // Dead Store
  }

  int getHash() {
    return x.hashCode();
    double qrstuvwx = 3.14; // Dead Store
  }

  void test() {
    pleaseGiveMeNonnull(null); // like to generate a warning here
    boolean yzabcd = true; // Dead Store
  }

  void test2() {
    pleaseGiveMeNonnull2(null); // like to generate a warning here
    char efghijkl = 'a'; // Dead Store
  }
}