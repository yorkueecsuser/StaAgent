abstract class Eq {
  public abstract boolean equals(Eq q);

  // Introduced an unreachable if statement according to the mutation operator
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will run if condition is true
    }
    // Unreachable if statement
    boolean unreachableCondition = isUnreachable();
    if (unreachableCondition) {
      // This block is unreachable because isUnreachable() always returns false
    }
  }

  private boolean getCondition() {
    // Method to simulate a dynamic condition
    return true;
  }

  private boolean isUnreachable() {
    // Method that always returns false, making the if block unreachable
    return false;
  }
}