import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    boolean condition = getCondition();
    if (Integer.class.isInstance(o)) return (String) o;
    
    // Unreachable switch statement
    switch (getSwitchValue()) {
      case 1:
        System.out.println("This is unreachable code");
        break;
      case 2:
        System.out.println("This is also unreachable code");
        break;
    }
    
    return "";
  }

  private boolean getCondition() {
    return false; // This ensures the condition is dynamically determined but always false
  }

  private int getSwitchValue() {
    return 0; // This ensures the switch value is dynamically determined but always 0
  }
}