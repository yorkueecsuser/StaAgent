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
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
  }

  synchronized int syncReadOk() {
    return i;
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
  }

  // Mutated code
  private Object nlock = new Object();

  @GuardedBy("nLock")
  private int z;

  public GuardedByTests(char x) {
    // don't warn on reads or writes of Guarded fields in constructor
    z = 0;
  }

  public void lockedWriteOk2() {
    synchronized (nlock) {
      z = 0;
    }
  }

  @GuardedBy("nLock")
  private int y;

  public void unlockedWriteBad2() {
    y = 0;
  }

  @GuardedBy("nLock")
  private int v;

  public int unlockedReadOk2() {
    return v;
  }

  public int lockedReadOk2() {
    synchronized (nlock) {
      return v;
    }
  }

  @GuardedBy("nLock")
  private int w;

  private void privateUnlockedWriteOk2() {
    w = 0;
  }

  public void interprocUnlockedWriteBad2() {
    privateUnlockedWriteOk2();
  }

  @GuardedBy("nLock")
  private int q;

  private int privateUnlockedReadOk2() {
    return q;
  }

  public int interprocUnlockedReadOk2() {
    return privateUnlockedReadOk2();
  }

  @GuardedBy("nLock")
  private int r;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite2() {
    r = 0;
  }

  @GuardedBy("nLock")
  private int t;

  @VisibleForTesting
  public void visibleForTestingOk2() {
    t = 0;
  }

  static Object plock = new Object();

  @GuardedBy("plock")
  static int pg;

  static {
    // don't warn on class initializer
    pg = 0;
  }

  @GuardedBy("this")
  int j;

  synchronized void syncWriteOk2() {
    j = 5;
  }

  synchronized int syncReadOk2() {
    return j;
  }

  GuardedByOther p;

  void accessThroughMemberObjectOk2() {
    p.accessBad();
  }

  void accessIndirectOk2(GuardedByOther p) {
    p.accessBad();
  }
}

class GuardedByOther {
  @GuardedBy("bla")
  int x;

  void accessBad() {
    x = 0;
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
  }
}