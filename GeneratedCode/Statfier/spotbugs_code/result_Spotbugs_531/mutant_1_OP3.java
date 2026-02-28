import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    if (Integer.class.isInstance(x)) return (String) x;
    // Mutant: Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return "This is unreachable";
    }
    return "";
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    // Mutant: Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return "This is also unreachable";
    }
    return "";
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false; // This method always returns false, but it's not a compile-time constant
  }
}