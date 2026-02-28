class UnreadFields {
  int x = 1;

  // Mutant code added here
  boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This loop is unreachable");
    }
  }
}