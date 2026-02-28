public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Added mutant code with an unreachable switch statement
  static void mutantMethod() {
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 0 : 1) {
      case 0:
        // This case is unreachable because alwaysFalse is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  static boolean getCondition() {
    return false;
  }
}