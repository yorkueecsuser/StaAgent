class Bug1871051 {
  @Override
  public Object clone() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }

    return new Bug1871051();
  }

  private boolean getCondition() {
    return false;
  }
}