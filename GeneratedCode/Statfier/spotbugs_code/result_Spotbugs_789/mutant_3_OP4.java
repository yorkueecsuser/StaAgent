import java.util.Random;

class Ideas_2011_06_29 {

  int x;
  long y;
  double z;

  void postIncrementAll() {
    x = x++;
    y = y++;
    z = z++;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = x + 10; // This code will never run
    } else {
      y = y - 5;  // This code will also never run
    }
  }

  void preIncrementAll() {
    x = ++x;
    y = ++y;
    z = ++z;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      z = z * 2; // This code will never run
    } else {
      x = x / 2; // This code will also never run
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

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never print"); // This code will never run
    } else {
      System.out.println("This will also never print"); // This code will also never run
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // Always returns false, ensuring the branches are unreachable
  }
}