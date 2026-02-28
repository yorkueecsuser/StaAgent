class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
    
    if (o instanceof CallSystemExit) return true;
    System.exit(1);
    return false;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and returns false
    return false;
  }
}