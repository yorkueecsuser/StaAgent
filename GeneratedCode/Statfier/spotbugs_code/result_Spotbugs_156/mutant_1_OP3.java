import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
      System.out.println("This will never be printed");
    }
    returnsNull().chars().map(x -> 42);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if statement is unreachable
    return false;
  }
}