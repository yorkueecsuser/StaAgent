public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Mutant code starts here
  static boolean getCondition() {
    return false;
  }

  static void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }
  }
}