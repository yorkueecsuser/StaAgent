import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    // Original buggy code
    return true;

    // Added mutant code with an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}