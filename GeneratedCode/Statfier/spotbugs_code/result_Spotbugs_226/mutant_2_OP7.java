public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Introduced an unreachable while loop as per the mutation operator
  static {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  // Helper method to simulate a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}