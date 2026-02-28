class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    return x + y;
  }

  public static int foo2(int a, int y) {
    if (a < 5 && a < 5) throw new IllegalArgumentException("This is wrong");
    return a + y;
  }

  public static int foo3(int b, int y) {
    if (b < 5) if (b < 5) throw new IllegalArgumentException("This is wrong");
    return b + y;
  }

  public static boolean foo4(int c, int d) {
    if (c == 3 || c!= 3 && d == 5) return true;
    return false;
  }
}