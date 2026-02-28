import codetoanalyze.java.annotation.ThreadSafe;
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

class GuardedByTests {
  private Object mlock = new Object();

  @GuardedBy("mLock")
  private int a;

  public GuardedByTests() {
    // don't warn on reads or writes of Guarded fields in constructor
    a = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  synchronized int syncReadOk() {
    return i;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class GuardedByOther {
  @GuardedBy("bla")
  int x;

  void accessBad() {
    x = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class GuardedByUiThread {
  @GuardedBy("UiThReAd")
  int a;

  @GuardedBy("ui-thread")
  int b;

  @GuardedBy("UI thread")
  int c;

  @GuardedBy("UI_THREAD")
  int d;

  void uithreadOk() {
    a = b = c = d = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}