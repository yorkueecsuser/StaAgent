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
  }

  void update(int v[]) {
    d = v;
    e = v;
  }

  // Mutated code
  volatile int[] g; // Renamed 'a' to 'g'
  int[] h; // Renamed 'b' to 'h'
  int y; // Renamed 'x' to 'y'
  volatile int z; // Renamed 'c' to 'z'
  volatile int[] i; // Renamed 'd' to 'i'
  @SuppressWarnings volatile int[] j; // Renamed 'e' to 'j'
  volatile int[] k; // Renamed 'f' to 'k'

  VolatileUsage2(boolean flag) {
    g = new int[100];
    i = new int[100];
  }

  void update(int w[]) {
    i = w;
    j = w;
  }
}