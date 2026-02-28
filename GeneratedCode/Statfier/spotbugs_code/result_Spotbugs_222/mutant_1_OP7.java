final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the loop remains unreachable
    return false;
  }
}