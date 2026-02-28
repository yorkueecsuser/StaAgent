public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Added mutant code with an unreachable if statement
  static {
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}