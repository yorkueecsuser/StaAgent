import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    if (Integer.class.isInstance(x)) return (String) x;
    // Mutant: Adding an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return "This will never be reached";
    } else {
      return "This will also never be reached";
    }
    return "";
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    // Mutant: Adding an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return "This will never be reached";
    } else {
      return "This will also never be reached";
    }
    return "";
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}