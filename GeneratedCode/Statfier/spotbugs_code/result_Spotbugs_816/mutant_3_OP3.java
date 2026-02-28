class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      tmp = "unreachable";
    }
    switch (x) {
      case 0:
        tmp = "zero";
        break;
      case 1:
        tmp = "one";
        break;
      case 2:
        tmp = "two";
        break;
    }
    return tmp.hashCode();
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}