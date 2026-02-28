import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);
    // Mutant: Duplicate the assignment statement
    int testDoubleMutant = (int) RANDOM.nextDouble();
    System.out.println(testDoubleMutant);
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);
    // Mutant: Duplicate the assignment statement
    int testFloatMutant = (int) RANDOM.nextFloat();
    System.out.println(testFloatMutant);
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);
    // Mutant: Duplicate the assignment statement
    int testLongMutant = (int) RANDOM.nextLong();
    System.out.println(testLongMutant);
  }
}