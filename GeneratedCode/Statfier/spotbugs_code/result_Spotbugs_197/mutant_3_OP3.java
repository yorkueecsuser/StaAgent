import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;
  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
      // Inserting an unreachable if branch
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable
        count--;
      }
    }
  }
}