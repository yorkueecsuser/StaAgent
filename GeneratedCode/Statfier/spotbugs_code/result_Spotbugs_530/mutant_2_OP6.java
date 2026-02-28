import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }

    if (Integer.class.isInstance(o)) return (String) o;
    return "";
  }

  private boolean getCondition() {
    // This method returns false, ensuring the loop remains unreachable
    return false;
  }
}