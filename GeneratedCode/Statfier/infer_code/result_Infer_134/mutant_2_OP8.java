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

  // Mutant 1: Renaming variable 'i' to 'x'
  private static void vanilla_switch_x(int x) {

    for (int p = 0; p < 100; p++) {
      switch (p) {
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

  // Mutant 2: Renaming variable 'value' to 'v'
  private static int test_switch_v() {
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