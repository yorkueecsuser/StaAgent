class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if the condition is true
    } else {
      // This is the unreachable else branch
      System.out.println("This is an unreachable else branch");
    }
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}