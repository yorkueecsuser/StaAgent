import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    // Original buggy code
    return true;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // This block is also intended to be unreachable
      System.out.println("This should also never be printed");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the if-else block remains unreachable
  }
}