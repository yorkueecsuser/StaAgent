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
    a = new int[100]; // Duplicate assignment
    d = new int[100];
  }

  void update(int v[]) {
    d = v;
    d = v; // Duplicate assignment
    e = v;
    e = v; // Duplicate assignment
  }
}