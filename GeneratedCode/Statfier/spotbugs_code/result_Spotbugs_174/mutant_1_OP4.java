class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    if (x == null) throw new NullPointerException();
    this.x = x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false at runtime
    }
  }

  void pleaseGiveMeNonnull2(Object x) {
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false at runtime
    }
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

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}