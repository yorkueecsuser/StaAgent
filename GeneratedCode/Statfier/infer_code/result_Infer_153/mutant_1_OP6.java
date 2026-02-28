class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loop remains unreachable
  }
}