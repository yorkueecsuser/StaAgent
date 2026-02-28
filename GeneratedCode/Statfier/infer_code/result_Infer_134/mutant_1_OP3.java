class Switch {
  // Cost 51
  private static void vanilla_switch(int i) {

    for (int p = 0; p < 100; p++) {
      switch (p) {
        case 0:
          i++;
          boolean condition = getCondition();
          if (condition) { // Unreachable if statement
            i--; // This line is unreachable
          }
          break;
        case 1:
        case 2:
        case 3:
          break;
        default:
          return;
      }
    }
  }

  // 797
  private static int test_switch() {
    int value = 0;
    // infinite loop
    while (value < 100) {
      switch (value) {
        case 0:
          boolean condition = getCondition();
          if (condition) { // Unreachable if statement
            value--; // This line is unreachable
          }
          break;
        case 1:
          continue;
        case 2:
        default:
          continue;
      }
      value++;
    }
    return 0;
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}