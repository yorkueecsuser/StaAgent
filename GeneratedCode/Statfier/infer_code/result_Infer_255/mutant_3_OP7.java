public enum ResType {
  SOME,
  NONE;

  // Introduced an unreachable while loop as per the mutation operator description
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the while loop is unreachable
    return false;
  }
}