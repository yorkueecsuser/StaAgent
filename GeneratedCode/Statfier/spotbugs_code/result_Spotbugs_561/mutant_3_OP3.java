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
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      a[0] = 999;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      b = new int[100];
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}