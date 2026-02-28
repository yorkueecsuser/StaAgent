class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
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
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is logically unreachable because getCondition() is not defined to return true
      tmp = "unreachable";
    } else {
      // This block is also logically unreachable for the same reason
      tmp = "also unreachable";
    }
    
    return tmp.hashCode();
  }

  // Dummy method to simulate a dynamic condition
  private boolean getCondition() {
    return false;
  }
}