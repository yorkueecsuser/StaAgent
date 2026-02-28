import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable else branch
      s.zeroOk();
    }
    s.zeroOk();
  }

  private boolean getCondition() {
    return false; // This ensures the else branch is unreachable but not due to a compile-time constant
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable else branch
      i = 0;
    }
    i = 0;
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false; // This ensures the else branch is unreachable but not due to a compile-time constant
  }
}