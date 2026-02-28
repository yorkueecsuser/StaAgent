class StringEqualityTest {

  boolean almostEmpty(String s) {
    return s.trim() == "";

    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will also never be executed because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the if-else branch unreachable
    return false;
  }
}