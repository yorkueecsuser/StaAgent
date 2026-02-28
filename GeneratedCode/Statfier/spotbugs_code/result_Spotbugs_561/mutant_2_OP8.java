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

  // Mutated code starts here
  volatile int[] z; // Renamed 'a' to 'z'
  int[] y; // Renamed 'b' to 'y'
  int q; // Renamed 'x' to 'q'
  volatile int r; // Renamed 'c' to 'r'
  volatile int[] s; // Renamed 'd' to's'
  @SuppressWarnings volatile int[] t; // Renamed 'e' to 't'
  volatile int[] u; // Renamed 'f' to 'u'

  VolatileUsage2(char g) { // Added a new constructor to use renamed variables
    z = new int[100];
    s = new int[100];
  }

  void modify(int h[]) { // Added a new method to use renamed variables
    s = h;
    t = h;
  }
}