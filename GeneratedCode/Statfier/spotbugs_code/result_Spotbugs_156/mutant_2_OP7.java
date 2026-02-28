import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      System.out.println("This is an unreachable loop");
    }

    returnsNull().chars().map(x -> 42);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the while loop remains unreachable
    return false;
  }
}