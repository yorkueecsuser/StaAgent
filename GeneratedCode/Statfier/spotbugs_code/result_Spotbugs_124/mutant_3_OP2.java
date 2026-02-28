class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    int temp = x; // Added mutant: duplicating an implicit assignment
    int temp = x; // Mutant
    return x + y;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    int sum = x + y; // Added mutant: duplicating an implicit assignment
    int sum = x + y; // Mutant
    return sum;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    int result = x + y; // Added mutant: duplicating an implicit assignment
    int result = x + y; // Mutant
    return result;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) {
      boolean flag = true; // Added mutant: duplicating an implicit assignment
      boolean flag = true; // Mutant
      return flag;
    }
    return false;
  }
}