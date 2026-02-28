class Ideas_2010_06_30 {

  int x;

  @Override
  public boolean equals(Object o) {
    // Introduced an unreachable while loop according to the mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    return (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;
  }

  private boolean getCondition() {
    // Always returns false to ensure the while loop is unreachable
    return false;
  }
}