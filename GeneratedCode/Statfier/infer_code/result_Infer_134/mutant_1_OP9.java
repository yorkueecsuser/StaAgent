class Switch {
  // Cost 51
  private static void vanilla_switch(int i) {

    int p = 0;
    do {
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
      p++;
    } while (p < 100);
  }
  // 797
  private static int test_switch() {
    int value = 0;
    // infinite loop
    do {
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
    } while (value < 100);
    return 0;
  }
}