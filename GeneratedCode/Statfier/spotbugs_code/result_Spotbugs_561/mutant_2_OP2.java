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
    a = new int[100]; // Mutant: Duplicate assignment
    d = new int[100];
  }

  void update(int v[]) {
    d = v;
    d = v; // Mutant: Duplicate assignment
    e = v;
    e = v; // Mutant: Duplicate assignment
  }
}