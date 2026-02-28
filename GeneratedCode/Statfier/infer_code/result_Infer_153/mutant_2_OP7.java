class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();
    
    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}