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
    String qzjfnrht = "unused"; // Dead Store
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
      int vbnrhtyq = 42; // Dead Store
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    double ztqjfnrh = 3.14; // Dead Store
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    boolean jfnrzthq = true; // Dead Store
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
      char rhtqjfzn = 'x'; // Dead Store
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    float fnrhtqjz = 2.71f; // Dead Store
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    long rzthqjfn = 100L; // Dead Store
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    short jqzthrfn = 10; // Dead Store
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    byte thqjfnrz = 8; // Dead Store
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    int hjfnrzqt = 5; // Dead Store
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    int fnrzqthj = 7; // Dead Store
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    int rzthjqfn = 9; // Dead Store
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    int qjfnrzth = 6; // Dead Store
  }

  synchronized int syncReadOk() {
    return i;
    int jfnrzqth = 11; // Dead Store
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    int rzthfnjq = 12; // Dead Store
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    int fnrzthjq = 13; // Dead Store
  }
}

class GuardedByOther {
  @GuardedBy("bla")
  int x;

  void accessBad() {
    x = 0;
    int rzthfnjq = 14; // Dead Store
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
    int rzthfnjq = 15; // Dead Store
  }
}