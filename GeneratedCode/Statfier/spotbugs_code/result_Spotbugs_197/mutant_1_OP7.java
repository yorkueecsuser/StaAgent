import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
    }
    // Introduced unreachable while loop with dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because getCondition() returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}