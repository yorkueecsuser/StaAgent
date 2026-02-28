import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to ensure the if statement is unreachable
    }
    s.zeroOk();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to ensure the if statement is unreachable
    }
    i = 0;
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}