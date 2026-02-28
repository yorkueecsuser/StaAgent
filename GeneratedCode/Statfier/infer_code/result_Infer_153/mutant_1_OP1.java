class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();
    // Mutant code added here
    Stringabcdefgh = "unusedVariable";
  }
}