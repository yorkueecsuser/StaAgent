public enum ResType {
  SOME,
  NONE;

  // Added unreachable for loop according to the mutation operator description
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
    }
  }

  private boolean getCondition() {
    // This method returns a condition that will make the loop unreachable
    return false;
  }
}