class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    this.value = value;

    // Mutant code added as per the Dead Store mutation operator
    int ykqjvbnr = 42; // Unused variable declaration
  }
}