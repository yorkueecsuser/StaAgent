import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;

    // Mutant code: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      field = field + 1;
    } else {
      // This block will also never execute because getCondition() returns false
      field = field - 1;
    }
  }

  private boolean getCondition() {
    // Always return false to make the if-else branch unreachable
    return false;
  }
}