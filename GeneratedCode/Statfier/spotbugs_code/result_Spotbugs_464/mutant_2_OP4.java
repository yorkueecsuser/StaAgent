import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;

    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = 42; // This branch is reachable if condition is true
    } else {
      x = 84; // This branch is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false; // Always returns false to ensure the else branch is unreachable
  }
}