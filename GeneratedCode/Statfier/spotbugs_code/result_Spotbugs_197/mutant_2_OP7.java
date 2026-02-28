import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
      
      // Introduced unreachable while loop as per mutation operator
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}