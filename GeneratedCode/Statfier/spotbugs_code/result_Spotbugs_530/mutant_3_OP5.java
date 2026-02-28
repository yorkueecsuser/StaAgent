import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    if (Integer.class.isInstance(o)) return (String) o;
    
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
    }
    
    return "";
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}