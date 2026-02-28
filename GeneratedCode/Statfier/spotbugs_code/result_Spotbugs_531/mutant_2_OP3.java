import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    // Original code
    if (Integer.class.isInstance(x)) return (String) x;
    return "";

    // Inserted unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      return "Unreachable";
    }
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    // Original code
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    return "";

    // Inserted unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      return "Unreachable";
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}