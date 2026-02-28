import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    returnsNull().chars().map(x -> 42);
  }

  private boolean getCondition() {
    // This method should return false to ensure the else block is unreachable
    return false;
  }
}