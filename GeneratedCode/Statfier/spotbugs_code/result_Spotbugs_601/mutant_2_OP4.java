class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    
    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will also never execute because there's no way to reach the else part either
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}