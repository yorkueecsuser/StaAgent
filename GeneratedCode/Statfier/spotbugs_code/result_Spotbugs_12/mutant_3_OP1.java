import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);
    // Dead Store Mutation
    int kqjvbnrt = 42; // Unique unused variable declaration
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);
    // Dead Store Mutation
    String xwvfubqp = "unused"; // Unique unused variable declaration
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);
    // Dead Store Mutation
    boolean mfnrhtyp = true; // Unique unused variable declaration
  }
}