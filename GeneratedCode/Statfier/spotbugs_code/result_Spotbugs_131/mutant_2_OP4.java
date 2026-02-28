abstract class Eq {
  public abstract boolean equals(Eq q);

  // Introduced an unreachable if-else statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return true;
  }
}