class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
    static InnerClassSingleton b = new InnerClassSingleton(); // Mutant: Renamed'singleton' to 'b'
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;
  static CircularClassInitialization c = InnerClassSingleton.b; // Mutant: Introduced new variable 'c' using renamed variable 'b'
}