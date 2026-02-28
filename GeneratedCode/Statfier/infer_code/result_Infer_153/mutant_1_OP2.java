class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();
    int temp = 0; // Original assignment statement
    int temp = 0; // Duplicated assignment statement
  }
}