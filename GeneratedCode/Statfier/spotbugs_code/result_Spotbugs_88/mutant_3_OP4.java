class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;
    
    // Mutant code start
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because getCondition() always returns false
      System.out.println("This is an unreachable else block");
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else block unreachable
  }
}