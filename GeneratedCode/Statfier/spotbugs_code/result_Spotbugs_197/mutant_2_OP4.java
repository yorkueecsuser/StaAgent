import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
      // Introduced an unreachable if-else statement with a dynamic condition
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block.");
      } else {
        // This block will also never execute because there's no other path to reach here
        System.out.println("This is another unreachable block.");
      }
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}