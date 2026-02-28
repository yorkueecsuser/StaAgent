class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    boolean conditionFor = getConditionForLoop();
    switch (x) {
      case 0:
        tmp = "zero";
        // Unreachable for loop
        for (int i = 0; conditionFor; i++) {
          // This loop will never execute because conditionFor is false
        }
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

  private boolean getConditionForLoop() {
    return false; // This method returns false, making the loop condition always false
  }
}