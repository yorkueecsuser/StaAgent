import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
      
      // Mutant code: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        count--;
      } else {
        // This block will always execute
        count++;
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}