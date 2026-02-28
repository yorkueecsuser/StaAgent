class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    while (x < 10) {
      System.out.println(x);
      x++;
    }
    // Added dead store: int kmvzqjfn
    int kmvzqjfn = 42;

    for (float y = 0.2f; y <= 1.0f; y += 0.1f) {
      System.out.println(y);
    }
    // Added dead store: String jxqfhtnm
    String jxqfhtnm = "unused";

    for (double d = 0.2d; d <= 1.0d; d += 0.1d) {
      System.out.println(d);
    }
    // Added dead store: boolean wvbnrhty
    boolean wvbnrhty = true;

    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      System.out.println(q);
      System.out.println(count);
    }
    // Added dead store: double ztqjvbnr
    double ztqjvbnr = 3.14;

    int c = 0;
    while (c < 5) {
      c++;
    }
    // Added dead store: char kqjvbnrt
    char kqjvbnrt = 'a';

    boolean b = true;
    while (b) {
      b = false;
    }
    // Added dead store: short vbnrtkqj
    short vbnrtkqj = 100;

    int p = 1;
    while (p < 9) {
      p *= 2;
    }
    // Added dead store: long jvbnrtkq
    long jvbnrtkq = 123456789L;
  }
}