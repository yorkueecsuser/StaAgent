class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Added mutant code
  static void mutantMethod() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code block
      System.out.println("This is an unreachable code block.");
    } else {
      // Alternative unreachable code block
      System.out.println("This is another unreachable code block.");
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}