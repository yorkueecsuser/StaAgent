final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This block is reachable.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This block is unreachable.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}