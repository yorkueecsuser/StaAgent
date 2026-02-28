class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();

    // Inserting an unreachable while loop
    static {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
      }
    }
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}