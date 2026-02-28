class DontUseFloatsAsLoopCounters {
  public static void main(String[] args) {
    // noncompliant
    float x = 0.1f;
    while (x < 10) {
      System.out.println(x);
      x++;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This is unreachable");
      }
    }
    for (float y = 0.2f; y <= 1.0f; y += 0.1f) {
      System.out.println(y);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This is also unreachable");
      }
    }
    for (double d = 0.2d; d <= 1.0d; d += 0.1d) {
      System.out.println(d);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Another unreachable statement");
      }
    }
    // compliant
    for (int count = 1; count <= 10; count += 1) {
      float q = count / 10.0f;
      System.out.println(q);
      System.out.println(count);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Yet another unreachable statement");
      }
    }
    int c = 0;
    while (c < 5) {
      c++;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Unreachable in while loop");
      }
    }
    boolean b = true;
    while (b) {
      b = false;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Unreachable in boolean while loop");
      }
    }
    int p = 1;
    while (p < 9) {
      p *= 2;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Unreachable in multiplication while loop");
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}