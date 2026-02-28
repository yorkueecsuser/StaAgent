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
    // Dead Store Mutation
    String yjvqfnrt = "unused";
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
    }
    // Dead Store Mutation
    int qzxcvbnm = 42;
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    // Dead Store Mutation
    boolean wertghjk = true;
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    // Dead Store Mutation
    char asdfghjk = 'a';
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
    }
    // Dead Store Mutation
    double lkjhgfds = 3.14;
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    // Dead Store Mutation
    float poiuytrew = 2.71f;
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    // Dead Store Mutation
    long zxcvbnml = 987654321L;
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    // Dead Store Mutation
    short poiuytr = 123;
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    // Dead Store Mutation
    byte qwertyui = 8;
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    // Dead Store Mutation
    int mnbvcxza = 567;
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    // Dead Store Mutation
    String lkjhgfdsa = "test";
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    // Dead Store Mutation
    int poiuytrewq = 100;
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    // Dead Store Mutation
    boolean cvbnmkjhg = false;
  }

  synchronized int syncReadOk() {
    return i;
    // Dead Store Mutation
    int zxcvbnmk = 678;
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    // Dead Store Mutation
    char asdfghjkl = 'b';
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    // Dead Store Mutation
    double poiuytrewq = 1.618;
  }
}

class GuardedByOther {
  @GuardedBy("bla")
  int x;

  void accessBad() {
    x = 0;
    // Dead Store Mutation
    String vbnmkjhg = "example";
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
    // Dead Store Mutation
    int asdfghjkl = 789;
  }
}