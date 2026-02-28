class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Added mutant code with an unreachable switch statement
  static {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is reachable only if getValue(condition) returns 1
        System.out.println("This is reachable if condition is true");
        break;
      case 2:
        // This case is unreachable because getValue(condition) never returns 2
        System.out.println("This is unreachable");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This ensures the condition is always false
  }

  private static int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // Ensures the switch never hits case 2
    }
  }
}