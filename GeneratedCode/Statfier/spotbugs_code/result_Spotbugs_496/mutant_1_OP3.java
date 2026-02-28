class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Introduced an unreachable if statement based on a non-final variable
  boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      sb.append("This will never be executed");
    }
  }
}