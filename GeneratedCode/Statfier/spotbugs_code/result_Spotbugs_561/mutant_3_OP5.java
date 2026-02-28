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
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        a[0] = 1;
        break;
      case 1:
        // This is the reachable case
        a[0] = 2;
        break;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        d[0] = 1;
        break;
      case 1:
        // This is the reachable case
        d[0] = 2;
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}