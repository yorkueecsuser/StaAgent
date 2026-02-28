class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    
    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      System.out.println("This block is reachable.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This block is unreachable.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}