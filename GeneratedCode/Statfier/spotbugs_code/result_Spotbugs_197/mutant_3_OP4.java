import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
      
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This is an unreachable block.");
      }
      // Mutant code end
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}