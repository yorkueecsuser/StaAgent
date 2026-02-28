abstract class Eq {
  public abstract boolean equals(Eq q);

  // Introduced an unreachable while loop as per the mutation operator
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}