import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      s.i = 42;
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 99;
    }
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false;
  }
}