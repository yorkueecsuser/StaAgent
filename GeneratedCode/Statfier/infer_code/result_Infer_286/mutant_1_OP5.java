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
        // This case will never be executed
        field = 0;
        break;
      default:
        // Default case will also never be executed due to alwaysFalse being false
        field = -1;
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}