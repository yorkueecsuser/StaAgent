class UnreadFields {
  int x = 1;

  // Mutated code starts here
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }
}