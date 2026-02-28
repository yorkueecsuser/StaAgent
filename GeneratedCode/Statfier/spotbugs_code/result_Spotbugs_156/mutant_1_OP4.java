import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block can be executed if shouldRun is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because shouldRun is never set to true in this context
      System.out.println("This is an unreachable block.");
    }
    
    returnsNull().chars().map(x -> 42);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the else block is unreachable
    return false;
  }
}