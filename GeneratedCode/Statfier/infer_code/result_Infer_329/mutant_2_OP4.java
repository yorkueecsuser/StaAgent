import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code
      s.zeroOk();
    }
    s.zeroOk();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code
      i = 0;
    }
    i = 0;
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}