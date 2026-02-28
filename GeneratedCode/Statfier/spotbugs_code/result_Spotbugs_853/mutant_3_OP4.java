class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    while (x < 10) {
      System.out.println(x);
      x++;
      // Mutant: Unreachable if-else statement
      boolean condition = false;
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    for (float y = 0.2f; y <= 1.0f; y += 0.1f) {
      System.out.println(y);
      // Mutant: Unreachable if-else statement
      boolean condition = false;
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    for (double d = 0.2d; d <= 1.0d; d += 0.1d) {
      System.out.println(d);
      // Mutant: Unreachable if-else statement
      boolean condition = false;
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      System.out.println(q);
      System.out.println(count);
      // Mutant: Unreachable if-else statement
      boolean condition = false;
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    int c = 0;
    while (c < 5) {
      c++;
      // Mutant: Unreachable if-else statement
      boolean condition = false;
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    boolean b = true;
    while (b) {
      b = false;
      // Mutant: Unreachable if-else statement
      boolean condition = false;
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    int p = 1;
    while (p < 9) {
      p *= 2;
      // Mutant: Unreachable if-else statement
      boolean condition = false;
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }
}