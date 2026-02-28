import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      field = field + 1;
    } else {
      // This block will also never execute because getCondition() always returns false
      field = field - 1;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}