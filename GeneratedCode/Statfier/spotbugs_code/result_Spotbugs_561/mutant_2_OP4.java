import edu.umd.cs.findbugs.annotations.SuppressWarnings;

@SuppressWarnings("UrF")
class VolatileUsage2 {
  volatile int[] a;

  int[] b;

  int x;

  volatile int c;

  volatile int[] d;

  @SuppressWarnings volatile int[] e;

  volatile int[] f;

  VolatileUsage2() {
    a = new int[100];
    d = new int[100];
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run because condition is always false
      a[0] = 100;
    } else {
      // This is the unreachable else block
      a[0] = 200;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run because shouldRun is always false
      d[0] = 300;
    } else {
      // This is the unreachable else block
      d[0] = 400;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}