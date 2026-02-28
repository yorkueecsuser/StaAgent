import java.util.Random;

class Ideas_2011_06_29 {

  int x;
  long y;
  double z;

  void postIncrementAll() {
    x = x++;
    y = y++;
    z = z++;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = x + 10; // This line is unreachable due to condition always being false
    }
  }

  void preIncrementAll() {
    x = ++x;
    y = ++y;
    z = ++z;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      y = y + 20; // This line is unreachable due to condition always being false
    }
  }

  @Override
  public String toString() {
    return "Ideas_2011_06_29 [x=" + x + ", y=" + y + ", z=" + z + "]";
  }

  public static void main(String args[]) {

    String f = "foobar";
    f.format("Test %s", "xx");
    Random r = new Random();
    int n = (int) r.nextDouble() * 10;
    Ideas_2011_06_29 tst = new Ideas_2011_06_29();
    System.out.println(tst);
    tst.postIncrementAll();
    System.out.println(tst);
    tst.preIncrementAll();
    System.out.println(tst);

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed"); // This line is unreachable due to condition always being false
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}