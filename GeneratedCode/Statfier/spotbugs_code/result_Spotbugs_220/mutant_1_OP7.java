class StringEqualityTest {

  boolean almostEmpty(String s) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    return s.trim() == "";
  }

  private boolean getCondition() {
    // This method returns false, ensuring the while loop remains unreachable
    return false;
  }
}