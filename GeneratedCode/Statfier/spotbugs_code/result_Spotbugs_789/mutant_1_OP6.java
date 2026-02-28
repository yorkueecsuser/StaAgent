import java.util.Random;

class Ideas_2011_06_29 {

  int x;
  long y;
  double z;

  void postIncrementAll() {
    x = x++;
    y = y++;
    z = z++;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  void preIncrementAll() {
    x = ++x;
    y = ++y;
    z = ++z;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
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
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}