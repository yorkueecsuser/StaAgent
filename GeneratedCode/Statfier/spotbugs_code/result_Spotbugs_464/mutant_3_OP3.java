import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;
    
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      x = 42;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}