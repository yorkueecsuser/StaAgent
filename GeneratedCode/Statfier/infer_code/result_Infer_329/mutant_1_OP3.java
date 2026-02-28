import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      s.zeroOk();
      System.out.println("This is unreachable code.");
    }
    s.zeroOk();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 0;
      System.out.println("This is unreachable code.");
    }
    i = 0;
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}