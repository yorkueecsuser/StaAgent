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
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      a[0] = 1;
    } else {
      // This block will always execute
      a[0] = 2;
    }
  }

  void update(int v[]) {
    d = v;
    e = v;
    // Mutant: Adding another unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      d[0] = 3;
    } else {
      // This block will always execute
      d[0] = 4;
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}