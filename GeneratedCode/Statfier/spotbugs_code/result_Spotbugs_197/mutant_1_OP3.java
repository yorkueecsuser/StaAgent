import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
      // Introduced an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        count--;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}