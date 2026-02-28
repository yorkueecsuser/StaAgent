class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Introduced mutant: Unreachable if-else statement
  static void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
      System.out.println("This might run");
    } else {
      // Unreachable code
      System.out.println("This will never run due to the condition");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This ensures the 'if' block runs and 'else' block is unreachable
  }
}