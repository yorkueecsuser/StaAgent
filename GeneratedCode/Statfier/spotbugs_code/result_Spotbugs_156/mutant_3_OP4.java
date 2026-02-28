import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    
    returnsNull().chars().map(x -> 42);
  }

  private boolean getCondition() {
    // This method should always return false to ensure the if-else block is unreachable
    return false;
  }
}