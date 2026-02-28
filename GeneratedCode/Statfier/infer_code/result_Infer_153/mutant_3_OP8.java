class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();
  }

  // Mutated code
  private int x() {
    return 1;
  }

  public void returnValueIgnoredMutant() {
    x();
  }
}