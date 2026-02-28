class IgnoredTrim {

  public void f(String s) {
    s.trim();
    
    // Introduced unreachable while loop according to mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}