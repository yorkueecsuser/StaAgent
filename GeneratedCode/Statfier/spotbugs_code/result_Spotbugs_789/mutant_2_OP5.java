import java.util.Random;

class Ideas_2011_06_29 {

  int x;
  long y;
  double z;

  void postIncrementAll() {
    x = x++;
    y = y++;
    z = z++;

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        x = x + 10; // This code is unreachable
        break;
      case 2:
        y = y + 10; // This code is unreachable
        break;
      default:
        z = z + 10; // This code is unreachable
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

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the switch unreachable
  }

  private int getValue(boolean condition) {
    return condition? 1 : 0; // This ensures the value is always 0, making the switch unreachable
  }
}