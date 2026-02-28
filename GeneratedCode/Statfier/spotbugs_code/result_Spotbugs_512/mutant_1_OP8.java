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
  }

  void update(int v[]) {
    d = v;
    e = v;
  }

  // Mutated code starts here
  volatile int[] x; // Renamed 'a' to 'x'
  int[] y; // Renamed 'b' to 'y'
  volatile int z; // Renamed 'c' to 'z'
  volatile int[] g; // Renamed 'd' to 'g'
  volatile int[] h; // Renamed 'e' to 'h'
  volatile int[] i; // Renamed 'f' to 'i'

  VolatileUsage(int initValue) {
    x = new int[initValue];
    g = new int[initValue];
  }

  void modify(int u[]) {
    g = u;
    h = u;
  }
}