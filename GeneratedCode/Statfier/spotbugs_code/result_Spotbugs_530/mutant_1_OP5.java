import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    if (Integer.class.isInstance(o)) return (String) o;
    return "";

    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This default case is also unreachable for the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}