class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Added mutant code with an unreachable if-else statement
  static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
  }

  static boolean getCondition() {
    return true; // This ensures the condition is always true, making the else block unreachable
  }
}