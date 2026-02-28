import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);
    // Dead Store Mutation
    int jxqfvtbn = 42;
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);
    // Dead Store Mutation
    String klmnopqr = "unused";
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);
    // Dead Store Mutation
    double rstuvwxy = 3.14;
  }
}