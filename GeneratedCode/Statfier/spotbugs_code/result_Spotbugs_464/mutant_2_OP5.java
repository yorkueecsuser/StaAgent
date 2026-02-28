import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        x = 42;
        break;
      default:
        // This default case is also unreachable for the same reason
        x = 24;
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}