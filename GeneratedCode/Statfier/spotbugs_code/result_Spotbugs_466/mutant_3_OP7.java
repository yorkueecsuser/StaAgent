import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadStatic {

  static String name;

  @ExpectWarning("ST")
  public BadStatic(String n) {
    name = n;
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}