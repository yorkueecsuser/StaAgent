class UnreadFields {
  int x = 1;

  public boolean getCondition() {
    return false;
  }

  public void someMethod() {
    // Original code can have additional methods or logic
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
      System.out.println("This loop is unreachable");
    }
  }
}