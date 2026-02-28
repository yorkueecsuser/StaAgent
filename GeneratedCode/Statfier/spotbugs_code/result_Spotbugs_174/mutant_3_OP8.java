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

  // Mutated code starts here

  Object y;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMenonnull(Object y) {
    if (y == null) throw new NullPointerException();
    this.y = y;
  }

  void pleaseGiveMenonnull2(Object y) {
    if (y == null) throw new NullPointerException("y isn't allowed to be null");
    this.y = y;
  }

  int getHash2() {
    return y.hashCode();
  }

  void test3() {
    pleaseGiveMenonnull(null); // like to generate a warning here
  }

  void test4() {
    pleaseGiveMenonnull2(null); // like to generate a warning here
  }
}