class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This branch is unreachable because shouldRun is always false
      System.out.println("This branch is unreachable.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}