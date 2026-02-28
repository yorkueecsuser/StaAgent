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
    // Dead Store Mutation
    String qwejrtyp = "unused";
  }

  void update(int v[]) {
    d = v;
    e = v;
    // Dead Store Mutation
    int yxvbnmki = 42;
  }
}