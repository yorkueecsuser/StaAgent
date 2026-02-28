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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      a = 1;
    } else {
      // Another unreachable code
      a = 2;
    }
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        a = 1;
      } else {
        // Another unreachable code
        a = 2;
      }
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      b = 1;
    } else {
      // Another unreachable code
      b = 2;
    }
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        c = 1;
      } else {
        // Another unreachable code
        c = 2;
      }
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      d = 1;
    } else {
      // Another unreachable code
      d = 2;
    }
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      d = 1;
    } else {
      // Another unreachable code
      d = 2;
    }
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      e = 1;
    } else {
      // Another unreachable code
      e = 2;
    }
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      f = 1;
    } else {
      // Another unreachable code
      f = 2;
    }
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      h = 1;
    } else {
      // Another unreachable code
      h = 2;
    }
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      sf = 1;
    } else {
      // Another unreachable code
      sf = 2;
    }
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      i = 1;
    } else {
      // Another unreachable code
      i = 2;
    }
  }

  synchronized int syncReadOk() {
    return i;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      i = 1;
    } else {
      // Another unreachable code
      i = 2;
    }
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      o.x = 1;
    } else {
      // Another unreachable code
      o.x = 2;
    }
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      o.x = 1;
    } else {
      // Another unreachable code
      o.x = 2;
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = 1;
    } else {
      // Another unreachable code
      x = 2;
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      a = 1;
    } else {
      // Another unreachable code
      a = 2;
    }
  }

  private boolean getCondition() {
    return false;
  }
}