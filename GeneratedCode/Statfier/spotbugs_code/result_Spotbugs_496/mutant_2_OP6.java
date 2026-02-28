class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Inserting an unreachable for loop
  static {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
      System.out.println("This loop should never execute.");
    }
  }

  private static boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}