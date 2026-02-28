class Ideas_2009_01_05 {

  Object x;

  // like to treat this as a method that must have a nonnull parameter
  void pleaseGiveMeNonnull(Object x) {
    if (x == null) throw new NullPointerException();
    this.x = x;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block.");
    } else {
      // Alternative block also unreachable due to the same reason
      System.out.println("This is another unreachable block.");
    }
  }

  void pleaseGiveMeNonnull2(Object x) {
    if (x == null) throw new NullPointerException("x isn't allowed to be null");
    this.x = x;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in pleaseGiveMeNonnull2.");
    } else {
      // Alternative block also unreachable due to the same reason
      System.out.println("This is another unreachable block in pleaseGiveMeNonnull2.");
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

  // Helper method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}