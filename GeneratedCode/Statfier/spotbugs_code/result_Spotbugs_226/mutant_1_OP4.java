public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Mutant code added below
  static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
  }

  static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}