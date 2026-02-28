class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    int temp = x + y; // Original assignment
    int temp2 = x + y; // Mutant assignment
    return temp;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    int sum = x + y; // Original assignment
    int sum2 = x + y; // Mutant assignment
    return sum;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    int result = x + y; // Original assignment
    int result2 = x + y; // Mutant assignment
    return result;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) return true;
    boolean condition = x == 3 || x!= 3 && y == 5; // Original assignment
    boolean condition2 = x == 3 || x!= 3 && y == 5; // Mutant assignment
    return condition;
  }
}