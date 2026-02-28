class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Mutant code added below
  static {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to ensure it's unreachable
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}