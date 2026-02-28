class StringEqualityTest {

  boolean almostEmpty(String s) {
    return s.trim() == "";

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}