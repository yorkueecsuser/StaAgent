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
    // This method will always return false, ensuring the while loop is unreachable
    return false;
  }
}