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
  }

  // Mutant of vanilla_switch with renamed variable 'p' to 'q'
  private static void mutant_vanilla_switch(int x) {

    for (int q = 0; q < 100; q++) {
      switch (q) {
        case 0:
          x++;
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

  // Mutant of test_switch with renamed variable 'value' to 'v'
  private static int mutant_test_switch() {
    int v = 0;
    // infinite loop
    while (v < 100) {
      switch (v) {
        case 0:
          break;
        case 1:
          continue;
        case 2:
        default:
          continue;
      }
      v++;
    }
    return 0;
  }
}