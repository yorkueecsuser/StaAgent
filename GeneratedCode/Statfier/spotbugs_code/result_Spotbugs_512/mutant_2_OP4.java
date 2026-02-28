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
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      a[0] = 10;
    } else {
      // This block will also never execute for the same reason
      a[0] = 20;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    // Mutant: Inserting another unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      d[0] = 30;
    } else {
      // This block will also never execute for the same reason
      d[0] = 40;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}