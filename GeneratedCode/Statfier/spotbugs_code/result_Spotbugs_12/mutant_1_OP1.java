import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);
    // Dead Store Mutation
    int ijklmnop = 42; // Unique unused variable declaration
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);
    // Dead Store Mutation
    Stringabcdefgh = "unused"; // Unique unused variable declaration
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);
    // Dead Store Mutation
    double xyzuvwxy = 3.14; // Unique unused variable declaration
  }
}