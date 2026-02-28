public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Added mutant code with an unreachable while loop
  static {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This loop will never execute.");
    }
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false;
  }
}