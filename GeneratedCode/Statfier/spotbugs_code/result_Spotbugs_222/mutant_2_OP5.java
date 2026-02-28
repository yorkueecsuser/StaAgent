final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      default:
        // This is the default case
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch is unreachable
    return false;
  }
}