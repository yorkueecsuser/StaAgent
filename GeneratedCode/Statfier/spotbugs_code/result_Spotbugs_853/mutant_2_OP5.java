class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    while (x < 10) {
      System.out.println(x);
      x++;
      // Inserting unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
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
      // Inserting unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
    int c = 0;
    while (c < 5) {
      c++;
      // Inserting unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
    boolean b = true;
    while (b) {
      b = false;
      // Inserting unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
    int p = 1;
    while (p < 9) {
      p *= 2;
      // Inserting unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}