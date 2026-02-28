class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    if (x == null) throw new NullPointerException();
    this.x = x;
  }

  void pleaseGiveMeNonnull2(Object x) {
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;
  }

  int getHash() {
    return x.hashCode();
  }

  void test() {
    pleaseGiveMeNonnull(null); // like to generate a warning here
  }

  void test2() {
    pleaseGiveMeNonnull2(null); // like to generate a warning here
  }

  // Mutated code
  Object y;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnullz(Object z) {
    if (z == null) throw new NullPointerException();
    this.y = z;
  }

  void pleaseGiveMeNonnull2b(Object b) {
    if (b == null) throw new NullPointerException("b isn't allowed to be null");
    this.y = b;
  }

  int getHashc() {
    return y.hashCode();
  }

  void testd() {
    pleaseGiveMeNonnullz(null); // like to generate a warning here
  }

  void teste() {
    pleaseGiveMeNonnull2b(null); // like to generate a warning here
  }
}