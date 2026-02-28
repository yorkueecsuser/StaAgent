class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    do {
      System.out.println(x);
      x++;
    } while (x < 10);

    float y = 0.2f;
    do {
      System.out.println(y);
      y += 0.1f;
    } while (y <= 1.0f);

    double d = 0.2d;
    do {
      System.out.println(d);
      d += 0.1d;
    } while (d <= 1.0d);

    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      System.out.println(q);
      System.out.println(count);
    }

    int c = 0;
    do {
      c++;
    } while (c < 5);

    boolean b = true;
    do {
      b = false;
    } while (b);

    int p = 1;
    do {
      p *= 2;
    } while (p < 9);
  }
}