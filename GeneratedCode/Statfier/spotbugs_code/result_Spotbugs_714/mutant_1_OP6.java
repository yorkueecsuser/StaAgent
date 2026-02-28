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

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
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

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }

    return 0;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the loop remains unreachable
    return false;
  }
}