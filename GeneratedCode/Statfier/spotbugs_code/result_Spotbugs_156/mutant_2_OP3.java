import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    returnsNull().chars().map(x -> 42);

    // Introduced unreachable if statement as per mutation operator
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}