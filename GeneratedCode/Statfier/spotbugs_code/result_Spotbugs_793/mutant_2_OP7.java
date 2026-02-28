class Issue758 {

  public void method() {
    Object[] array = new String[3];
    Object[] objects = (Object[]) array;

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is always false
    return false;
  }
}