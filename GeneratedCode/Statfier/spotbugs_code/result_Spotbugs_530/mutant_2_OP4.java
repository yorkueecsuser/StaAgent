import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    // Original code
    if (Integer.class.isInstance(o)) return (String) o;
    return "";

    // Added mutant code with an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return "Unreachable";
    } else {
      // This block is also unreachable for the same reason
      return "Also Unreachable";
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}