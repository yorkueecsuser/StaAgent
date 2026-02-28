import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    if (Integer.class.isInstance(o)) return (String) o;
    
    // Inserting an unreachable if-else branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      return "This will never be returned";
    } else {
      // This block is also unreachable due to the same condition
      return "This will also never be returned";
    }

    return "";
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}