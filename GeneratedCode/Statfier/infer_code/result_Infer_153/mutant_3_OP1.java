class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();
    // Dead store mutation
    String jhgfdsaq = "unused";
  }
}