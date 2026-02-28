class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    this.value = value;

    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.value = 20;
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false;
  }
}