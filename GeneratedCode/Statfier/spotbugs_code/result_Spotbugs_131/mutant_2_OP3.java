abstract class Eq {
  public abstract boolean equals(Eq q);

  // Introduced an unreachable if statement based on the mutation operator
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}