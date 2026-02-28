import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = 42; // This line is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}