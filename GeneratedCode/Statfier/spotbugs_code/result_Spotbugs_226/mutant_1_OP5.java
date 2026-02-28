public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Added mutant code with an unreachable switch statement
  default void mutantMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is unreachable because getValue(condition) will never return 1
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, ensuring the switch condition is never met
    return false;
  }

  private int getValue(boolean condition) {
    // This method returns 0, ensuring the switch condition is never met
    return condition? 1 : 0;
  }
}