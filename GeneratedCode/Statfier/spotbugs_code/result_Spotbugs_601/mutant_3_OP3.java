class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}