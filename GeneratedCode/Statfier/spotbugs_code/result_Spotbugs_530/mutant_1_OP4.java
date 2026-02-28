import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    // Original code
    if (Integer.class.isInstance(o)) return (String) o;
    return "";

    // Added unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable due to the same reason
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}