class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    if (x == null) throw new NullPointerException();
    this.x = x;

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This will also never be printed");
        break;
    }
  }

  void pleaseGiveMeNonnull2(Object x) {
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This will also never be printed");
        break;
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
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}