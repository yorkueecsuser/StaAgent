class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();

    // Added unreachable if statement with a dynamic condition
    boolean getCondition() {
      return false;
    }

    void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;
}