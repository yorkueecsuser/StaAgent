class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    switch (x) {
      case 0:
        tmp = "zero";
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable code
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
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}