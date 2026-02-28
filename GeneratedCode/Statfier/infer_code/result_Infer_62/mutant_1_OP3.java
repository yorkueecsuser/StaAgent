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
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      a = 1;
    }
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
    }
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      a = 2;
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      b = 1;
    }
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      c = 2;
    }
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
    }
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      c = 3;
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      d = 1;
    }
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      d = 2;
    }
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      e = 3;
    }
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      e = 4;
    }
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      f = 1;
    }
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      h = 1;
    }
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      sf = 1;
    }
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      i = 6;
    }
  }

  synchronized int syncReadOk() {
    return i;
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      i = 7;
    }
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      o.x = 8;
    }
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      o.x = 9;
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
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      x = 1;
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
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      a = b = c = d = 1;
    }
  }

  private boolean getCondition() {
    return false;
  }
}