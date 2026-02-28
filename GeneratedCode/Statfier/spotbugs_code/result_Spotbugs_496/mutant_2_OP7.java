class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Inserting an unreachable while loop
  static {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      sb.append("This is an unreachable loop");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}