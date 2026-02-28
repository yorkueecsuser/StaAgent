class ReturnValueIgnored {

  private int m() {
    return 1; // Original return statement
    return 1; // Duplicated return statement
  }

  public void returnValueIgnored() {
    m();
  }
}