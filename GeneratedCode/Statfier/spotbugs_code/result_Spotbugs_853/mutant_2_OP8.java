class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    while (x < 10) {
      System.out.println(x);
      x++;
    }
    for (float y = 0.2f; y <= 1.0f; y += 0.1f) {
      System.out.println(y);
    }
    for (double d = 0.2d; d <= 1.0d; d += 0.1d) {
      System.out.println(d);
    }
    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      System.out.println(q);
      System.out.println(count);
    }
    int c = 0;
    while (c < 5) {
      c++;
    }
    boolean b = true;
    while (b) {
      b = false;
    }
    int p = 1;
    while (p < 9) {
      p *= 2;
    }

    // Mutated code
    float a = 0.1f;
    while (a < 10) {
      System.out.println(a);
      a++;
    }
    for (float z = 0.2f; z <= 1.0f; z += 0.1f) {
      System.out.println(z);
    }
    for (double e = 0.2d; e <= 1.0d; e += 0.1d) {
      System.out.println(e);
    }
    // compliant
    for (int f = 1; f <= 10; f += 1) {
      float g = f / 10.0f;
      System.out.println(g);
      System.out.println(f);
    }
    int h = 0;
    while (h < 5) {
      h++;
    }
    boolean i = true;
    while (i) {
      i = false;
    }
    int j = 1;
    while (j < 9) {
      j *= 2;
    }
  }
}