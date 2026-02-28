class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Mutant code added here
  static {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Code that should run if condition is true
      sb.append("This should run if condition is true.");
    } else {
      // Unreachable if-else branch
      sb.append("This is an unreachable branch.");
    }
  }

  private static boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    return false; // This is just a placeholder; in a real scenario, this should be dynamic
  }
}