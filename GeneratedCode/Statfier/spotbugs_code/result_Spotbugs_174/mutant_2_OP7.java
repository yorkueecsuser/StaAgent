class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
    if (x == null) throw new NullPointerException();
    this.x = x;
  }

  void pleaseGiveMeNonnull2(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;
  }

  int getHash() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
    return x.hashCode();
  }

  void test() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
    pleaseGiveMeNonnull(null); // like to generate a warning here
  }

  void test2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
    pleaseGiveMeNonnull2(null); // like to generate a warning here
  }

  private boolean getCondition() {
    return false;
  }
}