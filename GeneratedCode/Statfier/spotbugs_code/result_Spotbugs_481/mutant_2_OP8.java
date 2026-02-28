class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
    static InnerClassSingleton x = new InnerClassSingleton(); // Mutant: Renamed'singleton' to 'x'
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;
  static CircularClassInitialization y = InnerClassSingleton.x; // Mutant: Introduced new variable 'y' using renamed 'x'
}