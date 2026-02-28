class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    return x + y;
  }

  // Mutant for foo method
  public static int foo_mutant_a(int a, int b) {
    if (a < 5 || a < 5) throw new IllegalArgumentException("This is wrong");
    return a + b;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    return x + y;
  }

  // Mutant for foo2 method
  public static int foo2_mutant_c(int c, int d) {
    if (c < 5 && c < 5) throw new IllegalArgumentException("This is wrong");
    return c + d;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    return x + y;
  }

  // Mutant for foo3 method
  public static int foo3_mutant_e(int e, int f) {
    if (e < 5) if (e < 5) throw new IllegalArgumentException("This is wrong");
    return e + f;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) return true;
    return false;
  }

  // Mutant for foo4 method
  public static boolean foo4_mutant_g(int g, int h) {
    if (g == 3 || g!= 3 && h == 5) return true;
    return false;
  }
}