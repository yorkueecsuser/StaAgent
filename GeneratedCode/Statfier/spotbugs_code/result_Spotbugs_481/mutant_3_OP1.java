class CircularClassInitialization {
  static class InnerClassSingleton extends CircularClassInitialization {
    static InnerClassSingleton singleton = new InnerClassSingleton();
    // Dead store mutation
    static String qvbnrhty = "unusedVariable";
  }

  static CircularClassInitialization foo = InnerClassSingleton.singleton;
}