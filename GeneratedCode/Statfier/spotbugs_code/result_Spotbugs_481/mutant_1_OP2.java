class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
    static InnerClassSingleton singletonDuplicate = new InnerClassSingleton(); // Duplicate assignment
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;
  static CircularClassInitialization fooDuplicate = InnerClassSingleton.singleton; // Duplicate assignment
}