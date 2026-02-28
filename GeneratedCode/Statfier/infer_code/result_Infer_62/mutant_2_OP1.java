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
    String qwejklmn = "unused"; // Dead store
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
      int rstuvwxy = 42; // Dead store
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    double abcdabcd = 3.14; // Dead store
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    boolean yxwvutsr = true; // Dead store
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
      char hgfedcba = 'z'; // Dead store
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    long klmnopqr = 123456789L; // Dead store
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    floatmnopqr = 1.23f; // Dead store
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    short stuvwxyz = 123; // Dead store
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    byte abcdefgh = 1; // Dead store
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    int jklmnopq = 987654321; // Dead store
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    int zxcvbnml = 456; // Dead store
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    int asdfghjk = 789; // Dead store
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    int qwertyui = 101010; // Dead store
  }

  synchronized int syncReadOk() {
    return i;
    int poiuytrewq = 202020; // Dead store
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    int lkjhgfdsa = 303030; // Dead store
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    int mnbvcxz = 404040; // Dead store
  }
}

class GuardedByOther {
  @GuardedBy("bla")
  int x;

  void accessBad() {
    x = 0;
    int cvbnmghj = 505050; // Dead store
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
    int tgbnhymju = 606060; // Dead store
  }
}