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
    }

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    if (condition) {
      int unreachableValue = 5; // This value will never match any case due to the condition
      switch (unreachableValue) {
        case 0:
          i--; // Unreachable code
          break;
        case 1:
          i += 2; // Unreachable code
          break;
        default:
          i *= 3; // Unreachable code
          break;
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
          break;
        case 1:
          continue;
        case 2:
        default:
          continue;
      }
      value++;
    }

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    if (condition) {
      int unreachableValue = 5; // This value will never match any case due to the condition
      switch (unreachableValue) {
        case 0:
          value--; // Unreachable code
          break;
        case 1:
          value += 2; // Unreachable code
          break;
        default:
          value *= 3; // Unreachable code
          break;
      }
    }
    return 0;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the switch statement is unreachable
  }
}