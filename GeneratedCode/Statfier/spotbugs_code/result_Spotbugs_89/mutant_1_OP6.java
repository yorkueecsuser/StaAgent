class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }

    return x;
  }

  private boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}