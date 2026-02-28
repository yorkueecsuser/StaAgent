import edu.umd.cs.findbugs.annotations.ExpectWarning;

/** Submitted by Claus Anderwald */
class Bug3383709 {

  @ExpectWarning("NP_LOAD_OF_KNOWN_NULL_VALUE")
  public int foo1(Object obj1, Object obj2) {

    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (obj2!= null) {
      return 1;
    }
    if (obj1!= null && obj2 == null) { // Findbugs warning: Load of known null value
      return 2;
    }

    return 0;
  }

  @ExpectWarning("NP_LOAD_OF_KNOWN_NULL_VALUE")
  public int foo2(Object obj1, Object obj2) {

    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (obj2!= null) {
      return 1;
    }
    if (obj1!= null && obj2 == null) { // no Findbugs warning...
      return 2;
    }

    return 0;
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but always returns false
  }
}