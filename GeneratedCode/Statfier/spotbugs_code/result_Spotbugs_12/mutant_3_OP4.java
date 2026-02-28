import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}