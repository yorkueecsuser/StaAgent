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

  // Mutated code starts here
  private Object qlock = new Object(); // Renamed from mlock to qlock

  @GuardedBy("qLock")
  private int z; // Renamed from a to z

  public GuardedByTests(char x) { // Renamed from a to x
    // don't warn on reads or writes of Guarded fields in constructor
    z = 0;
  }

  public void lockedWriteOkMutant() {
    synchronized (qlock) {
      z = 0;
    }
  }

  @GuardedBy("qLock")
  private int y; // Renamed from b to y

  public void unlockedWriteBadMutant() {
    y = 0;
  }

  @GuardedBy("qLock")
  private int w; // Renamed from c to w

  public int unlockedReadOkMutant() {
    return w;
  }

  public int lockedReadOkMutant() {
    synchronized (qlock) {
      return w;
    }
  }

  @GuardedBy("qLock")
  private int v; // Renamed from d to v

  private void privateUnlockedWriteOkMutant() {
    v = 0;
  }

  public void interprocUnlockedWriteBadMutant() {
    privateUnlockedWriteOkMutant();
  }

  @GuardedBy("qLock")
  private int u; // Renamed from e to u

  private int privateUnlockedReadOkMutant() {
    return u;
  }

  public int interprocUnlockedReadOkMutant() {
    return privateUnlockedReadOkMutant();
  }

  @GuardedBy("qLock")
  private int t; // Renamed from f to t

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWriteMutant() {
    t = 0;
  }

  @GuardedBy("qLock")
  private int s; // Renamed from h to s

  @VisibleForTesting
  public void visibleForTestingOkMutant() {
    s = 0;
  }

  static Object rlock = new Object(); // Renamed from slock to rlock

  @GuardedBy("rlock")
  static int rg; // Renamed from sf to rg

  static {
    // don't warn on class initializer
    rg = 0;
  }

  @GuardedBy("this")
  int p; // Renamed from i to p

  synchronized void syncWriteOkMutant() {
    p = 5;
  }

  synchronized int syncReadOkMutant() {
    return p;
  }

  GuardedByOther n; // Renamed from o to n

  void accessThroughMemberObjectOkMutant() {
    n.accessBad();
  }

  void accessIndirectOkMutant(GuardedByOther n) { // Renamed from o to n
    n.accessBad();
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