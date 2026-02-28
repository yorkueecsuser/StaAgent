import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getRandomBoolean();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getRandomBoolean();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getRandomBoolean();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getRandomBoolean() {
    return RANDOM.nextBoolean();
  }
}