import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);
    // Mutant code
    int x = (int) RANDOM.nextDouble();
    System.out.println(x);
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);
    // Mutant code
    int y = (int) RANDOM.nextFloat();
    System.out.println(y);
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);
    // Mutant code
    int z = (int) RANDOM.nextLong();
    System.out.println(z);
  }
}