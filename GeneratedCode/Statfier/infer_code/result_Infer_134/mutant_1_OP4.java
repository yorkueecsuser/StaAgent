class Switch {
  // Cost 51
  private static void vanilla_switch(int i) {

    for (int p = 0; p < 100; p++) {
      switch (p) {
        case 0:
          i++;
          break;
        case 1:
        case 2:
        case 3:
          break;
        default:
          return;
      }
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        i--;
      } else {
        // This block is also unreachable because condition is always false
        i += 2;
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }

  // 797
  private static int test_switch() {
    int value = 0;
    // infinite loop
    while (value < 100) {
      switch (value) {
        case 0:
          break;
        case 1:
          continue;
        case 2:
        default:
          continue;
      }
      value++;
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        value--;
      } else {
        // This block is also unreachable because condition is always false
        value += 2;
      }
    }
    return 0;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}