class Equality {

  public boolean equals(Equality e) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
    return false;
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }

  public static void main(String[] args) {}
}