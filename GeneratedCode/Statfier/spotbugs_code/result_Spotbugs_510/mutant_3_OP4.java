class UnreadFields {
  int x = 1;

  // Mutated code with an unreachable if-else statement
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block.");
    }
  }
}