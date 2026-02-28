import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    // Original buggy code
    return true;

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}