class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    while (x < 10) {
      System.out.println(x);
      x++;
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 1:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case is also unreachable");
      }
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
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 2:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case is also unreachable");
      }
    }
  }

  // Method to provide a dynamic value for switch condition
  private static int getValue() {
    return 0;
  }
}