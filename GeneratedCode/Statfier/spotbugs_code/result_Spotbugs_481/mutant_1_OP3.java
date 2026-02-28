class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();

    // Added mutant code with an unreachable if statement
    boolean getCondition() {
      return false;
    }

    void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }
    }
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;

  // Added mutant code with an unreachable if statement
  boolean getCondition() {
    return false;
  }

  void someOtherMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is also unreachable code.");
    }
  }
}