import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}