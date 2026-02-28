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

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return 3; // This branch is unreachable because condition is always false
    } else {
      return 4; // This branch is also unreachable because condition is always false
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

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return 5; // This branch is unreachable because condition is always false
    } else {
      return 6; // This branch is also unreachable because condition is always false
    }

    return 0;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the branches unreachable
  }
}