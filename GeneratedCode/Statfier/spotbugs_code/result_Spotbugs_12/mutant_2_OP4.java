import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);

    // Mutant code: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);

    // Mutant code: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is another unreachable if block");
    } else {
      System.out.println("This is another unreachable else block");
    }
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);

    // Mutant code: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is yet another unreachable if block");
    } else {
      System.out.println("This is yet another unreachable else block");
    }
  }
}