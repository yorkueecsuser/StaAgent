class IgnoredTrim {

  public void f(String s) {
    s.trim();
    
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  private boolean getCondition() {
    return false;
  }
}