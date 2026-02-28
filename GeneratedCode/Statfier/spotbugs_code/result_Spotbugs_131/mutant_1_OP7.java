abstract class Eq {
  public abstract boolean equals(Eq q);

  // Inserting an unreachable while loop
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method will always return false, making the while loop unreachable
    return false;
  }
}