class IgnoredTrim {

  public void f(String s) {
    s.trim();
    
    // Mutant code starts here
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}