import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;
    
    // Introduced an unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}