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

  // Mutated variables
  private Object nlock = new Object(); // Renamed from mlock to nlock

  @GuardedBy("nLock")
  private int z; // Renamed from a to z

  public GuardedByTests(char x) { // Added constructor with mutated parameter
    // don't warn on reads or writes of Guarded fields in constructor
    z = 0;
  }

  public void lockedWriteOkX() {
    synchronized (nlock) {
      z = 0;
    }
  }

  @GuardedBy("nLock")
  private int y; // Renamed from b to y

  public void unlockedWriteBadX() {
    y = 0;
  }

  @GuardedBy("nLock")
  private int v; // Renamed from c to v

  public int unlockedReadOkX() {
    return v;
  }

  public int lockedReadOkX() {
    synchronized (nlock) {
      return v;
    }
  }

  @GuardedBy("nLock")
  private int w; // Renamed from d to w

  private void privateUnlockedWriteOkX() {
    w = 0;
  }

  public void interprocUnlockedWriteBadX() {
    privateUnlockedWriteOkX();
  }

  @GuardedBy("nLock")
  private int q; // Renamed from e to q

  private int privateUnlockedReadOkX() {
    return q;
  }

  public int interprocUnlockedReadOkX() {
    return privateUnlockedReadOkX();
  }

  @GuardedBy("nLock")
  private int r; // Renamed from f to r

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWriteX() {
    r = 0;
  }

  @GuardedBy("nLock")
  private int t; // Renamed from h to t

  @VisibleForTesting
  public void visibleForTestingOkX() {
    t = 0;
  }

  static Object plock = new Object(); // Renamed from slock to plock

  @GuardedBy("plock")
  static int pg; // Renamed from sf to pg

  static {
    // don't warn on class initializer
    pg = 0;
  }

  @GuardedBy("this")
  int j; // Renamed from i to j

  synchronized void syncWriteOkX() {
    j = 5;
  }

  synchronized int syncReadOkX() {
    return j;
  }

  GuardedByOther p; // Renamed from o to p

  void accessThroughMemberObjectOkX() {
    p.accessBad();
  }

  void accessIndirectOkX(GuardedByOther p) { // Renamed parameter from o to p
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