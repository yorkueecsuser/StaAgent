class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      value = 20; // Unique code inside the loop
    }

    this.value = value;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}