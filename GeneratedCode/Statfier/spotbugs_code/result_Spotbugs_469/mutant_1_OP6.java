class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }

    this.value = value;
  }

  // Method to provide a dynamic condition that will be false
  private boolean getCondition() {
    return false;
  }
}