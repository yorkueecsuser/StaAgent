class StringEqualityTest {

  boolean almostEmpty(String s) {
    return s.trim() == "";

    // Introduced unreachable for loop as per mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}