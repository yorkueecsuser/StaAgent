class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();

    // Introduced an unreachable for loop with a dynamic condition
    static {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop will never execute because conditionFor is always false
      }
    }
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}