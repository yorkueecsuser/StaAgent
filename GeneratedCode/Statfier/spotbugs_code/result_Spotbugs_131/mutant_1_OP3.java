abstract class Eq {
  public abstract boolean equals(Eq q);

  // Mutant code added here
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
    // This method can return true or false based on some logic
    return true;
  }

  private boolean isUnreachable() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}