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
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
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
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
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
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  synchronized int syncReadOk() {
    return i;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}

class GuardedByOther {
  @GuardedBy("bla")
  int x;

  void accessBad() {
    x = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
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
      // Some code that should never run
    } else {
      // Another piece of code that should never run
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}