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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  public void lockedWriteOk() {
    synchronized (mlock) {
      a = 0;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }
  }

  @GuardedBy("mLock")
  private int b;

  public void unlockedWriteBad() {
    b = 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @GuardedBy("mLock")
  private int c;

  public int unlockedReadOk() {
    return c;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  public int lockedReadOk() {
    synchronized (mlock) {
      return c;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }
  }

  @GuardedBy("mLock")
  private int d;

  private void privateUnlockedWriteOk() {
    d = 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  public void interprocUnlockedWriteBad() {
    privateUnlockedWriteOk();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @GuardedBy("mLock")
  private int e;

  private int privateUnlockedReadOk() {
    return e;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  public int interprocUnlockedReadOk() {
    return privateUnlockedReadOk();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @GuardedBy("mLock")
  private int f;

  // NB ThreadSafe annotation disables GuardedBy check too
  @ThreadSafe(enableChecks = false)
  void suppressedWrite() {
    f = 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @GuardedBy("mLock")
  private int h;

  @VisibleForTesting
  public void visibleForTestingOk() {
    h = 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static Object slock = new Object();

  @GuardedBy("slock")
  static int sf;

  static {
    // don't warn on class initializer
    sf = 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @GuardedBy("this")
  int i;

  synchronized void syncWriteOk() {
    i = 5;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { /* unreachable loop */ }
  }

  synchronized int syncReadOk() {
    return i;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { /* unreachable loop */ }
  }

  GuardedByOther o;

  void accessThroughMemberObjectOk() {
    o.accessBad();
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) { /* unreachable loop */ }
  }

  void accessIndirectOk(GuardedByOther o) {
    o.accessBad();
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) { /* unreachable loop */ }
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
    boolean conditionFor = getCondition();
    for (int m = 0; conditionFor; m++) { /* unreachable loop */ }
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
    boolean conditionFor = getCondition();
    for (int n = 0; conditionFor; n++) { /* unreachable loop */ }
  }

  private boolean getCondition() {
    return false;
  }
}