class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();
    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block");
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false;
  }
}