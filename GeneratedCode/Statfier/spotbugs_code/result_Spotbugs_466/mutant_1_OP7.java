import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadStatic {

  static String name;

  @ExpectWarning("ST")
  public BadStatic(String n) {
    name = n;
    
    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}