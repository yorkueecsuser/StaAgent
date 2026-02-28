final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      foo = 42;
    }
  }

  private boolean getCondition() {
    return false;
  }
}