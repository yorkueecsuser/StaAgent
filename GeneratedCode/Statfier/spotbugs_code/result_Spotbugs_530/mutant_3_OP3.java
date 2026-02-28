import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    if (Integer.class.isInstance(o)) return (String) o;
    
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return "This is unreachable";
    }
    
    return "";
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}