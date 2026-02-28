public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Added unreachable for loop as per mutation operator
  static void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and not set to true anywhere
    }
  }

  static boolean getCondition() {
    return false; // This method returns false, ensuring the loop condition is never met
  }
}