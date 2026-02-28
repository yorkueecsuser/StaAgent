class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
    // Mutant: Duplicate the assignment statement
    static InnerClassSingleton singletonDuplicate = new InnerClassSingleton();
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;
  // Mutant: Duplicate the assignment statement
  static CircularClassInitialization fooDuplicate = InnerClassSingleton.singleton;
}