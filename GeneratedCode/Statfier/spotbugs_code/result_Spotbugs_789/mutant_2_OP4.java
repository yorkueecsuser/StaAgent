import java.util.Random;

class Ideas_2011_06_29 {

  int x;
  long y;
  double z;

  void postIncrementAll() {
    x = x++;
    y = y++;
    z = z++;
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      x = x + 10;
    } else {
      // This block will always execute
      y = y - 5;
    }
  }

  void preIncrementAll() {
    x = ++x;
    y = ++y;
    z = ++z;
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      z = z * 2;
    } else {
      // This block will always execute
      x = x / 2;
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

    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will always execute
      System.out.println("This is a reachable else block.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}