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
    // Dead store mutation
    String qwertyui;
  }

  void update(int v[]) {
    d = v;
    e = v;
    // Dead store mutation
    int asdfghjk;
  }
}