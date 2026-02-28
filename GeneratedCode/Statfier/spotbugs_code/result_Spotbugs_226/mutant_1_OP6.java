public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Mutant code added to introduce an unreachable for loop
  static {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute.");
    }
  }

  // Method to provide a dynamic condition for the loop
  private static boolean getCondition() {
    return false; // This ensures the loop condition is always false at runtime
  }
}