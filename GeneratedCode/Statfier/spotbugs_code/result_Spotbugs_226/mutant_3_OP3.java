public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Mutant code added here
  static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("This is an unreachable if statement.");
    }
  }

  static boolean getCondition() {
    return false;
  }
}