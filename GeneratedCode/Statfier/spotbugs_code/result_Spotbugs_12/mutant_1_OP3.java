import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}