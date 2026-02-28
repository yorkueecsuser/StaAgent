import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      x = 20;
    } else {
      // This block is unreachable because shouldRun is always false
      x = 30;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}