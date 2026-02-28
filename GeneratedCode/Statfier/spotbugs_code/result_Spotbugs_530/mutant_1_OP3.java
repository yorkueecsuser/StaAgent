import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    // Original code
    if (Integer.class.isInstance(o)) return (String) o;
    return "";

    // Added mutant code
    boolean condition = getCondition();
    if (condition) {
      // This block is logically unreachable because getCondition() will never return true
      System.out.println("This is an unreachable if statement");
    }
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false;
  }
}