class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Inserting an unreachable for loop
  static {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
      System.out.println("This loop is unreachable");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}