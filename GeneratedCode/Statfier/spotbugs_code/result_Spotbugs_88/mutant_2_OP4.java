class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;

    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}