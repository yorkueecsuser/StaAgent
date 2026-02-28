class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();

    // Introduced unreachable for loop based on mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}