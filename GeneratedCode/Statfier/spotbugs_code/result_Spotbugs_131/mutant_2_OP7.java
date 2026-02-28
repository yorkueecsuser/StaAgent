abstract class Eq {
  public abstract boolean equals(Eq q);

  // Inserting an unreachable while loop
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This will never be printed");
    }
  }
}