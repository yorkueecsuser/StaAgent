import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadStatic {

  static String name;

  @ExpectWarning("ST")
  public BadStatic(String n) {
    name = n;
    
    // Introduced an unreachable if statement with a dynamically determined condition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      name = "Unreachable";
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}