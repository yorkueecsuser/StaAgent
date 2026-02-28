import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    if (Integer.class.isInstance(x)) return (String) x;
    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      return "Unreachable";
    } else {
      return "Still Unreachable";
    }
    return "";
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      return "Unreachable";
    } else {
      return "Still Unreachable";
    }
    return "";
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}