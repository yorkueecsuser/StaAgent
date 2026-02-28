import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  int getOk() {
    return i;
  }

  private boolean getCondition() {
    return false;
  }
}