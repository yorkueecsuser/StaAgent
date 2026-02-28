public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Added mutant code with an unreachable while loop
  static {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
  }

  static boolean getCondition() {
    return false;
  }
}