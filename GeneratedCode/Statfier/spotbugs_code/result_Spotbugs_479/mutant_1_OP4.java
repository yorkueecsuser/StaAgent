class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  // Introduced an unreachable if-else statement with a dynamically determined condition
  boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if getCondition() returns true
      System.out.println("This is reachable if shouldRun is true.");
    } else {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is unreachable.");
    }
  }
}