class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return false;
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}