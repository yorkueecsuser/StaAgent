import edu.umd.cs.findbugs.annotations.ExpectWarning;

class VolatileUsage {
  @ExpectWarning("VO")
  volatile int[] a;

  int[] b;

  volatile int c;

  volatile int[] d;

  volatile int[] e;

  volatile int[] f;

  VolatileUsage() {
    a = new int[100];
    d = new int[100];
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      a[0] = 999;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      e[0] = 888;
    }
  }

  private boolean getCondition() {
    return false;
  }
}