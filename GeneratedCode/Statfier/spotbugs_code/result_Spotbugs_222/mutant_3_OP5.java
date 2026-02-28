final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Adding an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also not be executed due to the same reason
        System.out.println("This is also unreachable.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}