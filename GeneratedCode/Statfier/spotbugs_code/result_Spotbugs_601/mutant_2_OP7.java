class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    
    // Introduced unreachable while loop according to mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() should return false
    }
  }

  private boolean getCondition() {
    // This method returns false ensuring the while loop is unreachable
    return false;
  }
}