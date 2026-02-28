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
      // This loop is unreachable because getCondition() always returns false
    }

    returnsNull().chars().map(x -> 42);
  }

  private boolean getCondition() {
    return false;
  }
}