abstract class Eq {
  public abstract boolean equals(Eq q);

  // Introduced an unreachable if-else statement according to the mutation operator
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    // This method will always return false, making the else block unreachable
    return false;
  }
}