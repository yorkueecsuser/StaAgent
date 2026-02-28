class IgnoredTrim {

  public void f(String s) {
    s.trim();
    
    // Introduced an unreachable if statement as per the mutation operator
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}