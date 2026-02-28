public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Added mutant code to introduce an unreachable switch statement
  static void mutantMethod() {
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the nature of the switch expression
        System.out.println("This will also never be printed");
        break;
    }
  }

  // Method to provide a dynamic false value
  static boolean getAlwaysFalse() {
    return false;
  }
}