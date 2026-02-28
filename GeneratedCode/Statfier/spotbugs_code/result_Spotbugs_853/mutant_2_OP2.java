class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    x = 0.1f; // Mutant: Duplicate assignment
    while (x < 10) {
      System.out.println(x);
      x++;
      x++; // Mutant: Duplicate increment
    }
    for (float y = 0.2f; y <= 1.0f; y += 0.1f) {
      System.out.println(y);
      y += 0.1f; // Mutant: Duplicate increment
    }
    for (double d = 0.2d; d <= 1.0d; d += 0.1d) {
      System.out.println(d);
      d += 0.1d; // Mutant: Duplicate increment
    }
    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      q = count / 10.0f; // Mutant: Duplicate assignment
      System.out.println(q);
      System.out.println(count);
      count += 1; // Mutant: Duplicate increment
    }
    int c = 0;
    c = 0; // Mutant: Duplicate assignment
    while (c < 5) {
      c++;
      c++; // Mutant: Duplicate increment
    }
    boolean b = true;
    b = true; // Mutant: Duplicate assignment
    while (b) {
      b = false;
      b = false; // Mutant: Duplicate assignment
    }
    int p = 1;
    p = 1; // Mutant: Duplicate assignment
    while (p < 9) {
      p *= 2;
      p *= 2; // Mutant: Duplicate increment
    }
  }
}