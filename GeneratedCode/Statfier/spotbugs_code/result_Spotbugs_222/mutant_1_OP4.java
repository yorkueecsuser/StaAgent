final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Introducing an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      System.out.println("This is the reachable block.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is the unreachable block.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}