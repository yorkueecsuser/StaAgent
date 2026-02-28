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
      // Unreachable code
      a[0] = 42;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      b = new int[100];
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}