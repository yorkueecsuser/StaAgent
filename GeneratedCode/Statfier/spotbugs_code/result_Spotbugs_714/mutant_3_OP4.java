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

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      return 3;
    } else {
      // This block is also intended to be unreachable
      return 4;
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

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      return 5;
    } else {
      // This block is also intended to be unreachable
      return 6;
    }

    return 0;
  }

  private boolean getCondition() {
    // This method should always return false to ensure the if-else blocks are unreachable
    return false;
  }
}