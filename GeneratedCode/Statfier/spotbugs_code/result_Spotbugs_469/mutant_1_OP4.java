class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    this.value = value;

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      value = 20;
    } else {
      // Alternative block
      value = 30;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}