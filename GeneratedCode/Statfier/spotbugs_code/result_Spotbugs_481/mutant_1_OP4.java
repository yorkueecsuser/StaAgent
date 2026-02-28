class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Introduced mutant: Unreachable if-else statement
  static void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  private static boolean getCondition() {
    return true; // This ensures the if block runs and the else block is unreachable
  }
}