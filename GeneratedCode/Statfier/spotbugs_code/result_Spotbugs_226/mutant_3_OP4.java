public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Mutant code added according to the mutation operator
  static void checkCondition() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block due to shouldRun always being false
    }
  }

  static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}