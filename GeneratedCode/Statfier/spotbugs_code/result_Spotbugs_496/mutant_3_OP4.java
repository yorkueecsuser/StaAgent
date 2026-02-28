class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Added mutant code with an unreachable if-else statement
  static {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      sb.append("This will run if shouldRun is true.");
    } else {
      // This branch is unreachable because getCondition() always returns false
      sb.append("This is an unreachable statement.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}