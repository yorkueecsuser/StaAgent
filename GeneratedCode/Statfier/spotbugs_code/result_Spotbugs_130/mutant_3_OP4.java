import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      return false;
    } else {
      // This block will also never execute because condition is always false
      return true;
    }
    return true;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}