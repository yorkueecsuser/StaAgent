import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is unreachable");
    }
    
    return true;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}