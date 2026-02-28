class Bug1871051 {
  @Override
  public Object clone() {
    // Introducing an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }

    return new Bug1871051();
  }

  private boolean getCondition() {
    // This method ensures that the condition for the while loop is always false
    return false;
  }
}