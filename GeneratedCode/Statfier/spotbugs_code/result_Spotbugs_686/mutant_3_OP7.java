class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Introduced an unreachable while loop according to the mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    return new CloneIdiom3();
  }

  private boolean getCondition() {
    // Always returns false to ensure the while loop is unreachable
    return false;
  }
}