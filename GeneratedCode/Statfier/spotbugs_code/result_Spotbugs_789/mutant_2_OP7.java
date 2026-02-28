import java.util.Random;

class Ideas_2011_06_29 {

  int x;
  long y;
  double z;

  void postIncrementAll() {
    x = x++;
    y = y++;
    z = z++;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      x = x + 10;
      y = y + 10;
      z = z + 10;
    }
  }

  void preIncrementAll() {
    x = ++x;
    y = ++y;
    z = ++z;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      x = x - 10;
      y = y - 10;
      z = z - 10;
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

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      f = f + "mutant";
      n = n + 5;
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}