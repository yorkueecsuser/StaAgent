class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();

    // Unreachable for loop inserted
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}