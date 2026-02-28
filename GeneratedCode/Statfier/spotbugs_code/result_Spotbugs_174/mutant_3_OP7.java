class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    if (x == null) throw new NullPointerException();
    this.x = x;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
  }

  void pleaseGiveMeNonnull2(Object x) {
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
  }

  int getHash() {
    return x.hashCode();
  }

  void test() {
    pleaseGiveMeNonnull(null); // like to generate a warning here
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
  }

  void test2() {
    pleaseGiveMeNonnull2(null); // like to generate a warning here
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the while loop unreachable
  }
}