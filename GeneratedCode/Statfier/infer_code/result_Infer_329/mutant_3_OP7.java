import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    s.zeroOk();
  }

  private boolean getCondition() {
    return false;
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    i = 0;
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false;
  }
}