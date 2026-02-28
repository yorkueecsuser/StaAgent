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
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          break;
      }
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          break;
      }
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  synchronized int syncReadOk() {
    return i;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
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
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
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
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}