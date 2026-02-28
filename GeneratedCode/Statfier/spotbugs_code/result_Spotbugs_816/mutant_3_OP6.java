class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    switch (x) {
      case 0:
        tmp = "zero";
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable loop
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

  private boolean getCondition() {
    return false; // This method will always return false, making the loop unreachable
  }
}