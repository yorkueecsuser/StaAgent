import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;

    // Introduced an unreachable if-else statement with a dynamically determined condition
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      field = field + 1;
    } else {
      // This block will always execute
      field = field - 1;
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getCondition() {
    return false;
  }
}