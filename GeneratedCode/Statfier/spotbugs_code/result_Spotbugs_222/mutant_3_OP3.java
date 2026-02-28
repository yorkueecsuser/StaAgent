final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Introducing an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      foo = 42;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}