final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Adding an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        System.out.println("This is unreachable code.");
        break;
      default:
        // Default case will also never be executed
        System.out.println("This is also unreachable code.");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}