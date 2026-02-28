class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the while loop is unreachable
    return false;
  }
}