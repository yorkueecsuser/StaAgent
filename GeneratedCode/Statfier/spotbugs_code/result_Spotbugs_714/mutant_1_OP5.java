import edu.umd.cs.findbugs.annotations.ExpectWarning;

/** Submitted by Claus Anderwald */
class Bug3383709 {

  @ExpectWarning("NP_LOAD_OF_KNOWN_NULL_VALUE")
  public int foo1(Object obj1, Object obj2) {

    if (obj2!= null) {
      return 1;
    }
    if (obj1!= null && obj2 == null) { // Findbugs warning: Load of known null value
      return 2;
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        return 3;
      default:
        // Default case to avoid unreachable statement error
        break;
    }

    return 0;
  }

  @ExpectWarning("NP_LOAD_OF_KNOWN_NULL_VALUE")
  public int foo2(Object obj1, Object obj2) {

    if (obj2!= null) {
      return 1;
    }
    if (obj1!= null && obj2 == null) { // no Findbugs warning...
      return 2;
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        return 3;
      default:
        // Default case to avoid unreachable statement error
        break;
    }

    return 0;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}