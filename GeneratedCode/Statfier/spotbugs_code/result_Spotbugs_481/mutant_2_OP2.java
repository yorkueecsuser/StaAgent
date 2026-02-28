class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
    // Mutant: Duplicated assignment statement
    static InnerClassSingleton singletonCopy = new InnerClassSingleton();
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;
  // Mutant: Duplicated assignment statement
  static CircularClassInitialization fooCopy = InnerClassSingleton.singleton;
}