final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code can continue here
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is always true, making the else block unreachable
  }
}