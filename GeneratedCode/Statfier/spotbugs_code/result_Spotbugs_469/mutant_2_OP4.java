class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    this.value = value;

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      value = 20;
    } else {
      // This block will always execute
      value = 30;
    }
  }

  private boolean getCondition() {
    return false;
  }
}