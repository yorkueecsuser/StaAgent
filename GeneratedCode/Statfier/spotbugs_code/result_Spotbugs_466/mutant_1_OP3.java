import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadStatic {

  static String name;

  @ExpectWarning("ST")
  public BadStatic(String n) {
    name = n;
    
    // Mutant code: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      name = "Unreachable";
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}