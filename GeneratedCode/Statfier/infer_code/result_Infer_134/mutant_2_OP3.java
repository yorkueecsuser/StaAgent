class Switch {
  // Cost 51
  private static void vanilla_switch(int i) {

    for (int p = 0; p < 100; p++) {
      switch (p) {
        case 0:
          i++;
          boolean unreachableCondition = getUnreachableCondition();
          if (unreachableCondition) {
            // This block is unreachable
            i--;
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
          boolean unreachableCondition = getUnreachableCondition();
          if (unreachableCondition) {
            // This block is unreachable
            value--;
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

  // Method to provide a dynamically determined condition that is always false
  private static boolean getUnreachableCondition() {
    return false;
  }
}