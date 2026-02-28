class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}