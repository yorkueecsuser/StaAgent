class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    if (x == null) throw new NullPointerException();
    this.x = x;
    String qjvfrtzu = "unusedVariable"; // Dead Store mutation
  }

  void pleaseGiveMeNonnull2(Object x) {
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;
    int kxwvbnmr = 42; // Dead Store mutation
  }

  int getHash() {
    return x.hashCode();
    boolean hgfdsapq = false; // Dead Store mutation
  }

  void test() {
    pleaseGiveMeNonnull(null); // like to generate a warning here
    double ytrhgbnm = 3.14; // Dead Store mutation
  }

  void test2() {
    pleaseGiveMeNonnull2(null); // like to generate a warning here
    char zxvbnmlk = 'a'; // Dead Store mutation
  }
}