import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = 42;
        break;
      case 1:
        // This case is always executed
        x = 24;
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch case 0 is unreachable
    return false;
  }
}