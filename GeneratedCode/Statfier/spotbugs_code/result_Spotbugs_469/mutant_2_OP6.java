class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    this.value = value;

    // Introduced unreachable for loop according to mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() should return false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is false, making the loop unreachable
  }
}