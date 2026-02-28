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

  // Mutant of vanilla_switch with variable renaming
  private static void vanilla_switch_m(int x) {

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

  // Mutant of test_switch with variable renaming
  private static int test_switch_m() {
    int z = 0;
    // infinite loop
    while (z < 100) {
      switch (z) {
        case 0:
          break;
        case 1:
          continue;
        case 2:
        default:
          continue;
      }
      z++;
    }
    return 0;
  }
}