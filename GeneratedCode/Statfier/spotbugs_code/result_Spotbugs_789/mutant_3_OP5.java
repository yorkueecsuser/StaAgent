import java.util.Random;

class Ideas_2011_06_29 {

  int x;
  long y;
  double z;

  void postIncrementAll() {
    x = x++;
    y = y++;
    z = z++;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = 100;
        y = 200;
        z = 300.0;
        break;
      default:
        // Default case will also never be executed
        x = -1;
        y = -1;
        z = -1.0;
        break;
    }
  }

  void preIncrementAll() {
    x = ++x;
    y = ++y;
    z = ++z;
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
  }

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}