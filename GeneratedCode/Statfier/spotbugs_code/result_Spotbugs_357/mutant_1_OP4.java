class IgnoredTrim {

  public void f(String s) {
    s.trim();
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable because shouldRun is always false");
    }
  }

  private boolean getCondition() {
    return false;
  }
}