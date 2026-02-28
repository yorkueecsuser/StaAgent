class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Introduced an unreachable switch statement
  static void someMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is reachable only if getValue(condition) returns 1
        System.out.println("This is reachable if condition is true");
        break;
      case 2:
        // This case is unreachable because getValue(condition) will never return 2
        System.out.println("This is unreachable");
        break;
    }
  }

  static boolean getCondition() {
    return false; // This ensures the condition is always false, making case 2 unreachable
  }

  static int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // Ensures the switch will not hit case 2
    }
  }
}