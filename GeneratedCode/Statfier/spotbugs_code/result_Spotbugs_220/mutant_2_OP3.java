class StringEqualityTest {

  boolean almostEmpty(String s) {
    return s.trim() == "";
    
    // Introduced an unreachable if statement as per the mutation operator
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}