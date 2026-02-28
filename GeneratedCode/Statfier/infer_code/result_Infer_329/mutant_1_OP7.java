import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    i = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false;
  }
}