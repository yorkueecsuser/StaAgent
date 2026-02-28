class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Introduced an unreachable while loop according to the mutation operator
  static {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable loop");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}