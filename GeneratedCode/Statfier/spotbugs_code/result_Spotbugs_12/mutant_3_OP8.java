import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);
    // Mutant
    int a = (int) RANDOM.nextDouble();
    System.out.println(a);
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);
    // Mutant
    int b = (int) RANDOM.nextFloat();
    System.out.println(b);
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);
    // Mutant
    int c = (int) RANDOM.nextLong();
    System.out.println(c);
  }
}