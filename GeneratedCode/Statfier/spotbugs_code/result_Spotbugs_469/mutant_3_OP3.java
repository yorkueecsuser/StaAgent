class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      this.value = 20;
    }

    this.value = value;
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}