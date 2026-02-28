public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Mutant code added below
  static boolean getCondition() {
    return false;
  }

  static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable if statement.");
    }
  }
}