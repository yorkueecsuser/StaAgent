class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    x = 0.1f; // Mutant: duplicated assignment
    while (x < 10) {
      System.out.println(x);
      x++;
      x++; // Mutant: duplicated assignment
    }
    for (float y = 0.2f; y <= 1.0f; y += 0.1f) {
      System.out.println(y);
      y += 0.1f; // Mutant: duplicated assignment
    }
    for (double d = 0.2d; d <= 1.0d; d += 0.1d) {
      System.out.println(d);
      d += 0.1d; // Mutant: duplicated assignment
    }
    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      System.out.println(q);
      System.out.println(count);
      count += 1; // Mutant: duplicated assignment
    }
    int c = 0;
    c = 0; // Mutant: duplicated assignment
    while (c < 5) {
      c++;
      c++; // Mutant: duplicated assignment
    }
    boolean b = true;
    while (b) {
      b = false;
      b = false; // Mutant: duplicated assignment
    }
    int p = 1;
    p = 1; // Mutant: duplicated assignment
    while (p < 9) {
      p *= 2;
      p *= 2; // Mutant: duplicated assignment
    }
  }
}