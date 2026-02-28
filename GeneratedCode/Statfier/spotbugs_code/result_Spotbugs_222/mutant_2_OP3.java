final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This will never be printed");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}