import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadStatic {

  static String name;

  @ExpectWarning("ST")
  public BadStatic(String n) {
    name = n;
    
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This is reachable.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable.");
    }
  }

  private boolean getCondition() {
    // Always returns false, making the else block unreachable
    return false;
  }
}