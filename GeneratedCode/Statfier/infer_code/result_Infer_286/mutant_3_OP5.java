import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        field += 10;
        break;
      default:
        // Default case is also unreachable due to the same reason
        field -= 5;
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}