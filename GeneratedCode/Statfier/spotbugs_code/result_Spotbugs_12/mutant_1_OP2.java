import java.util.Random;

class Issue1518 {
  private final Random RANDOM = new Random();

  public void testDouble() {
    int testDouble = (int) RANDOM.nextDouble();
    System.out.println(testDouble);
    int testDoubleCopy = (int) RANDOM.nextDouble(); // Mutant: duplicated assignment
    System.out.println(testDoubleCopy); // Additional print for the mutant
  }

  public void testFloat() {
    int testFloat = (int) RANDOM.nextFloat();
    System.out.println(testFloat);
    int testFloatCopy = (int) RANDOM.nextFloat(); // Mutant: duplicated assignment
    System.out.println(testFloatCopy); // Additional print for the mutant
  }

  public void testLong() {
    int testLong = (int) RANDOM.nextLong();
    System.out.println(testLong);
    int testLongCopy = (int) RANDOM.nextLong(); // Mutant: duplicated assignment
    System.out.println(testLongCopy); // Additional print for the mutant
  }
}