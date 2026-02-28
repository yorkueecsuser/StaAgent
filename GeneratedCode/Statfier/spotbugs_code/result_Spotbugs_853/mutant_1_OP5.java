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
      }
    }
    for (float y = 0.2f; y <= 1.0f; y += 0.1f) {
      System.out.println(y);
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 2:
          System.out.println("This is unreachable");
          break;
      }
    }
    for (double d = 0.2d; d <= 1.0d; d += 0.1d) {
      System.out.println(d);
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 3:
          System.out.println("This is unreachable");
          break;
      }
    }
    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      System.out.println(q);
      System.out.println(count);
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 4:
          System.out.println("This is unreachable");
          break;
      }
    }
    int c = 0;
    while (c < 5) {
      c++;
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 5:
          System.out.println("This is unreachable");
          break;
      }
    }
    boolean b = true;
    while (b) {
      b = false;
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 6:
          System.out.println("This is unreachable");
          break;
      }
    }
    int p = 1;
    while (p < 9) {
      p *= 2;
      // Inserting unreachable switch statement
      boolean condition = false;
      switch (getValue()) {
        case 7:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  // Method to provide a dynamic value for switch statement
  private static int getValue() {
    return 0;
  }
}