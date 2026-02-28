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
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      a[0] = 10;
    } else {
      // This block will always execute
      a[0] = 20;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      d[0] = 30;
    } else {
      // This block will always execute
      d[0] = 40;
    }
  }

  // Helper method to return a condition that is always false
  private boolean getCondition() {
    return false;
  }
}